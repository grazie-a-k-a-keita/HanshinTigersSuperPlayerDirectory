async function findAllPlayer() {
    const response = await
        fetch('/reference');
    return await
        response.json();
}

(async function () {
    const allPlayer = await findAllPlayer();

    for (let i = 0; i < allPlayer.length; i++){
        const tr = document.createElement('tr');
        tr.id = 'tr' + i;
        document.getElementById('tbody').appendChild(tr)

        const tdBackNumber = document.createElement('td')
        tdBackNumber.innerText = allPlayer[i].backNumber
        document.getElementById('tr' + i).appendChild(tdBackNumber)

        const tdName = document.createElement('td')
        tdName.innerText = allPlayer[i].name
        document.getElementById('tr' + i).appendChild(tdName)

        const tdPosition = document.createElement('td')
        tdPosition.innerText = allPlayer[i].position
        document.getElementById('tr' + i).appendChild(tdPosition)

    }
}());

// タッチしたとき一番下に行く処理
function hoge() {

    var elm = document.documentElement;

    var bottom = elm.scrollHeight - elm.clientHeight;

    window.scroll(0, bottom);

}