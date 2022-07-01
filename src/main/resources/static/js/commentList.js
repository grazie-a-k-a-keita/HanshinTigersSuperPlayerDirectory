// url(パラム)にアクセス(fetch)
async function findPlayer(id) {
    const response = await
        fetch('/id?id=' + id);
    return await
        response.json();
}

async function findCommentList() {
    const response = await
        fetch('/comments');
    return await
        response.json();
}

// 即時関数(テーブルの中身作成)
(async function () {
    const commentList = await findCommentList()

    for (let i = 0; i < commentList.length; i++) {

        const player = await findPlayer(i + 1)

        const tr = document.createElement('tr')
        tr.id = 'tr' + i
        document.getElementById('table').appendChild(tr)

        // 名前
        const tdname = document.createElement('td')
        tdname.id = 'tdname' + i
        tdname.innerText = player.name
        document.getElementById('tr' + i).appendChild(tdname)
        // 選手ID
        const tdId = document.createElement('td')
        tdId.id = 'tdId' + i
        tdId.innerText = commentList[i].id
        document.getElementById('tr' + i).appendChild(tdId)
        // 選手情報
        const tdInformation = document.createElement('td')
        tdInformation.id = 'tdInformation' + i
        tdInformation.innerText = commentList[i].context
        document.getElementById('tr' + i).appendChild(tdInformation)
        // 作成日
        const tdDate = document.createElement('td')
        tdDate.id = 'tdDate' + i
        tdDate.innerText = commentList[i].createAt
        document.getElementById('tr' + i).appendChild(tdDate)
        // 俺的コメント
        const tdMyContext = document.createElement('td')
        tdMyContext.id = 'tdMyContext' + i
        tdMyContext.innerText = commentList[i].myContext
        document.getElementById('tr' + i).appendChild(tdMyContext)
        // 編集ボタン(td)
        const tdButton = document.createElement('td')
        tdButton.id = 'tdButton' + i
        document.getElementById('tr' + i).append(tdButton)
        // 編集ボタン
        const button = document.createElement('button')
        button.innerText = '編集'
        button.dataset.playerId = commentList[i].id
        document.getElementById('tdButton' + i).appendChild(button)
        // playerIdを付与して画面遷移
        button.addEventListener('click', function (e) {
            console.log(e.target.dataset.playerId);
            window.location.href = '/comment/edit?id=' + e.target.dataset.playerId;
        })
    }
})();