// url(パラム)にアクセス(fetch)
async function findComment(playerId) {
  const response = await fetch("/fetchComment?id=" + playerId);
  return await response.json();
}

// 即時関数(idからtextareaの中身作成)
(async function () {
  let url = new URL(window.location.href);
  let params = url.searchParams;
  const comment = await findComment(params.get("id"));

  document.getElementById("context").innerText = comment.context;
  document.getElementById("myContext").innerText = comment.myContext;

  // 更新を実行、コメントリストに移動
  const update = document.getElementById("update");
  update.addEventListener("click", async function () {
    await fetch("/edit", {
      method: "post",
      headers: {
        "Content-Type": "application/json",
      },
      body: JSON.stringify({
        context: document.getElementById("context").value,
        myContext: document.getElementById("myContext").value,
        id: params.get("id"),
      }),
    });
    window.location.href = "/commentList";
  });

  // コメントリストに移動
  const back = document.getElementById("back");
  back.addEventListener("click", function () {
    window.location.href = "/commentList";
  });
})();
