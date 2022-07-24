// <DB接続メソッド>
// url(パラム)にアクセス(fetch)する関数
// async function findPlayer(number) {
//   const response = await fetch("/player?number=" + number);
//   return await response.json();
// }

// async function findComment(playerId) {
//   const response = await fetch("/fetchComment?id=" + playerId);
//   return await response.json();
// }

// async function findBatterRecord(playerId) {
//   const response = await fetch("/batterRecord?playerId=" + playerId);
//   return await response.json();
// }

// async function findPitcherPerformance(playerId) {
//   const response = await fetch("/pitcherPerformance?playerId=" + playerId);
//   return await response.json();
// }

// async function findDefensivePerformance(playerId) {
//   const response = await fetch("/defensivePerformance?playerId=" + playerId);
//   return await response.json();
// }

// ボタンをクリックしたときにクリック関数を付与 + Enterでクリック関数実行
document.getElementById("find-button").addEventListener("click", onClick);
window.document.onkeydown = function (event) {
  if (event.key === "Enter") {
    onClick();
  }
};

// ヘッダーをクリックしたときにページをリセット
const headerTitle = document.getElementById("headerTitle");
headerTitle.addEventListener("click", pageReset);

// ページをリセットする関数
function pageReset() {
  facePicture.src = "";
  facePicture.alt = "";
  document.getElementById("facePicture").classList.remove("frame");

  document.getElementById("number").innerText = "";
  document.getElementById("name").innerText = "";
  document.getElementById("position").innerText = "";
  document.getElementById("leftAndRight").innerText = "";

  const removeComments = Array.from(
    document.getElementById("comment").getElementsByTagName("p")
  );
  for (let removeTarget of removeComments) {
    removeTarget.remove();
  }

  document.getElementById("batterRecordTable").classList.add("hide");

  const removeBatterRecordTable = Array.from(
    document.getElementById("batterRecordTableBody").getElementsByTagName("td")
  );
  for (let removeTarget of removeBatterRecordTable) {
    removeTarget.remove();
  }

  document.getElementById("pitcherPerformanceTable").classList.add("hide");

  const removePitcherPerformanceTable = Array.from(
    document
      .getElementById("pitcherPerformanceTableBody")
      .getElementsByTagName("td")
  );
  for (let removeTarget of removePitcherPerformanceTable) {
    removeTarget.remove();
  }

  const removeDefensivePerformanceTable = Array.from(
    document
      .getElementById("defensivePerformanceTable")
      .getElementsByTagName("table")
  );
  for (let removeTarget of removeDefensivePerformanceTable) {
    removeTarget.remove();
  }
}

// クリックしたときの関数
async function onClick() {
  const number = document.getElementById("number-input").value;

  try {
    // <DB接続時取得データ>
    // const player = await findPlayer(number);

    // テスト用データ
    const player = {
      backNumber: "1",
      name: "",
      position: "",
      facePicture: "",
      leftAndRight: "",
    };

    // 背番号判別
    if (number === "") {
      pageReset();
      return alert("数値を入力してください");
    }

    // 一度リセット
    pageReset();
    document.getElementById("batterRecordTable").classList.remove("hide");
    document.getElementById("pitcherPerformanceTable").classList.remove("hide");

    // 選手詳細情報作成
    const facePicture = document.getElementById("facePicture");
    facePicture.src = player.facePicture;
    facePicture.alt = player.name;
    document.getElementById("facePicture").classList.add("frame");

    document.getElementById("number").innerText =
      "背番号：　" + player.backNumber + "番";
    document.getElementById("name").innerText = "名前：　" + player.name;
    document.getElementById("position").innerText =
      "ポジション：　" + player.position;
    document.getElementById("leftAndRight").innerText =
      "投 / 打：　" + player.leftAndRight;

    // 選手情報とコメント作成

    // <DB接続時取得データ>
    // const comments = await findComment(player.id);

    // テスト用データ
    const comments = {
      context: "",
      myContext: "",
    };

    const para = document.createElement("p");
    para.innerText = "選手情報：\n" + comments.context;
    document.getElementById("comment").appendChild(para);

    const para2 = document.createElement("p");
    para2.innerText = "俺的コメント：\n" + comments.myContext;
    document.getElementById("comment").appendChild(para2);

    // 打撃成績表作成
    document.getElementById("batterRecordTable").classList.add("hide");
    if (
      player.position === "投手" ||
      player.position === "捕手" ||
      player.position === "内野手" ||
      player.position === "外野手"
    ) {
      const batterRecord = await findBatterRecord(player.id);
      let game = 1;
      let bat = 2;
      let atBat = 3;
      let score = 4;
      let hitting = 5;
      let twoBaseHit = 6;
      let threeBaseHit = 7;
      let homeRun = 8;
      let baseHit = 9;
      let runBattedIn = 10;
      let stolenBase = 11;
      let caughtStealing = 12;
      let sacrificeBunt = 13;
      let sacrificeFly = 14;
      let walk = 15;
      let intentionalWalk = 16;
      let hit_by_a_pitch = 17;
      let strikeOut = 18;
      let doublePlay = 19;
      let battingAverage = 20;
      let sluggingPercentage = 21;
      let onBasePercentage = 22;
      if (batterRecord.game) {
        // 打撃成績テーブルのthead表示
        document.getElementById("batterRecordTable").classList.remove("hide");
        // idとplayerIdの2項目を除いて項目の回数for文を回す
        for (
          let batterItem = 1;
          batterItem <= Object.keys(batterRecord).length - 2;
          batterItem++
        ) {
          const td = document.createElement("td");
          switch (batterItem) {
            case game:
              td.innerText = batterRecord.game;
              break;
            case bat:
              td.innerText = batterRecord.bat;
              break;
            case atBat:
              td.innerText = batterRecord.atBat;
              break;
            case score:
              td.innerText = batterRecord.score;
              break;
            case hitting:
              td.innerText = batterRecord.hitting;
              break;
            case twoBaseHit:
              td.innerText = batterRecord.twoBaseHit;
              break;
            case threeBaseHit:
              td.innerText = batterRecord.threeBaseHit;
              break;
            case homeRun:
              td.innerText = batterRecord.homeRun;
              break;
            case baseHit:
              td.innerText = batterRecord.baseHit;
              break;
            case runBattedIn:
              td.innerText = batterRecord.runBattedIn;
              break;
            case stolenBase:
              td.innerText = batterRecord.stolenBase;
              break;
            case caughtStealing:
              td.innerText = batterRecord.caughtStealing;
              break;
            case sacrificeBunt:
              td.innerText = batterRecord.sacrificeBunt;
              break;
            case sacrificeFly:
              td.innerText = batterRecord.sacrificeFly;
              break;
            case walk:
              td.innerText = batterRecord.walk;
              break;
            case intentionalWalk:
              td.innerText = batterRecord.intentionalWalk;
              break;
            case hit_by_a_pitch:
              td.innerText = batterRecord.hit_by_a_pitch;
              break;
            case strikeOut:
              td.innerText = batterRecord.strikeOut;
              break;
            case doublePlay:
              td.innerText = batterRecord.doublePlay;
              break;
            case battingAverage:
              td.innerText = batterRecord.battingAverage;
              break;
            case sluggingPercentage:
              td.innerText = batterRecord.sluggingPercentage;
              break;
            case onBasePercentage:
              td.innerText = batterRecord.onBasePercentage;
              break;
          }
          document.getElementById("batterRecordTableBody").appendChild(td);
        }
      }
    }

    // 投手成績表作成
    document.getElementById("pitcherPerformanceTable").classList.add("hide");
    if (player.position === "投手") {
      const pitcherPerformance = await findPitcherPerformance(player.id);
      let pitched = 1;
      let win = 2;
      let lose = 3;
      let save = 4;
      let hold = 5;
      let holdPoint = 6;
      let completeGame = 7;
      let shutout = 8;
      let noFourBalls = 9;
      let winRate = 10;
      let batter = 11;
      let inningsPitched = 12;
      let hitting = 13;
      let homeRun = 14;
      let walk = 15;
      let intentionalWalk = 16;
      let hit_by_a_pitch = 17;
      let strikeOut = 18;
      let wildPitch = 19;
      let balk = 20;
      let conceded = 21;
      let earnedRun = 22;
      let earnedRunAverage = 23;
      if (pitcherPerformance.pitched) {
        // 投手成績テーブルのthead表示
        document
          .getElementById("pitcherPerformanceTable")
          .classList.remove("hide");
        // idとplayerIdの2項目を除いて項目の回数for文を回す
        for (
          let pitcherItem = 1;
          pitcherItem <= Object.keys(pitcherPerformance).length - 2;
          pitcherItem++
        ) {
          const td = document.createElement("td");
          switch (pitcherItem) {
            case pitched:
              td.innerText = pitcherPerformance.pitched;
              break;
            case win:
              td.innerText = pitcherPerformance.win;
              break;
            case lose:
              td.innerText = pitcherPerformance.lose;
              break;
            case save:
              td.innerText = pitcherPerformance.save;
              break;
            case hold:
              td.innerText = pitcherPerformance.hold;
              break;
            case holdPoint:
              td.innerText = pitcherPerformance.holdPoint;
              break;
            case completeGame:
              td.innerText = pitcherPerformance.completeGame;
              break;
            case shutout:
              td.innerText = pitcherPerformance.shutout;
              break;
            case noFourBalls:
              td.innerText = pitcherPerformance.noFourBalls;
              break;
            case winRate:
              td.innerText = pitcherPerformance.winRate;
              break;
            case batter:
              td.innerText = pitcherPerformance.batter;
              break;
            case inningsPitched:
              td.innerText = pitcherPerformance.inningsPitched;
              break;
            case hitting:
              td.innerText = pitcherPerformance.hitting;
              break;
            case homeRun:
              td.innerText = pitcherPerformance.homeRun;
              break;
            case walk:
              td.innerText = pitcherPerformance.walk;
              break;
            case intentionalWalk:
              td.innerText = pitcherPerformance.intentionalWalk;
              break;
            case hit_by_a_pitch:
              td.innerText = pitcherPerformance.hit_by_a_pitch;
              break;
            case strikeOut:
              td.innerText = pitcherPerformance.strikeOut;
              break;
            case wildPitch:
              td.innerText = pitcherPerformance.wildPitch;
              break;
            case balk:
              td.innerText = pitcherPerformance.balk;
              break;
            case conceded:
              td.innerText = pitcherPerformance.conceded;
              break;
            case earnedRun:
              td.innerText = pitcherPerformance.earnedRun;
              break;
            case earnedRunAverage:
              td.innerText = pitcherPerformance.earnedRunAverage;
              break;
          }
          document
            .getElementById("pitcherPerformanceTableBody")
            .appendChild(td);
        }
      }
    }

    // 守備成績表作成
    if (
      player.position === "投手" ||
      player.position === "捕手" ||
      player.position === "内野手" ||
      player.position === "外野手"
    ) {
      const defensivePerformance = await findDefensivePerformance(player.id);
      if (defensivePerformance[0].defensivePosition) {
        for (let i = 0; i < defensivePerformance.length; i++) {
          const table = document.createElement("table");
          table.id = "defensivePerformance" + i;
          document
            .getElementById("defensivePerformanceTableConteiner")
            .appendChild(table);

          const caption = document.createElement("caption");
          caption.innerText =
            "守備成績(2021) 【" +
            defensivePerformance[i].defensivePosition +
            "】";
          document
            .getElementById("defensivePerformance" + i)
            .appendChild(caption);

          const thead = document.createElement("thead");
          thead.id = "defensivePerformanceTableHead" + i;
          document
            .getElementById("defensivePerformance" + i)
            .appendChild(thead);

          if (defensivePerformance[i].defensivePosition === "捕手") {
            // idとplayerIdとpositionの3項目を除いて項目の回数for文を回す
            for (
              let defensiveTh = 1;
              defensiveTh <= Object.keys(defensivePerformance[i]).length - 3;
              defensiveTh++
            ) {
              const th = document.createElement("th");
              let game = 1;
              let putOut = 2;
              let killing = 3;
              let error = 4;
              let doublePlay = 5;
              let passedBall = 6;
              let fieldingPercentage = 7;
              switch (defensiveTh) {
                case game:
                  th.innerText = "試\n\n合";
                  break;
                case putOut:
                  th.innerText = "刺\n\n殺";
                  break;
                case killing:
                  th.innerText = "捕\n\n殺";
                  break;
                case error:
                  th.innerText = "失\n\n策";
                  break;
                case doublePlay:
                  th.innerText = "併\n\n殺";
                  break;
                case passedBall:
                  th.innerText = "捕\n\n逸";
                  break;
                case fieldingPercentage:
                  th.innerText = "守\n備\n率";
                  break;
              }
              document
                .getElementById("defensivePerformanceTableHead" + i)
                .appendChild(th);
            }
          } else {
            // idとplayerIdとpositionとpassedBallの4項目を除いて項目の回数for文を回す
            for (
              let defensiveTh = 1;
              defensiveTh <= Object.keys(defensivePerformance[i]).length - 4;
              defensiveTh++
            ) {
              const th = document.createElement("th");
              let game = 1;
              let putOut = 2;
              let killing = 3;
              let error = 4;
              let doublePlay = 5;
              let fieldingPercentage = 6;
              switch (defensiveTh) {
                case game:
                  th.innerText = "試\n\n合";
                  break;
                case putOut:
                  th.innerText = "刺\n\n殺";
                  break;
                case killing:
                  th.innerText = "捕\n\n殺";
                  break;
                case error:
                  th.innerText = "失\n\n策";
                  break;
                case doublePlay:
                  th.innerText = "併\n\n殺";
                  break;
                case fieldingPercentage:
                  th.innerText = "守\n備\n率";
                  break;
              }
              document
                .getElementById("defensivePerformanceTableHead" + i)
                .appendChild(th);
            }
          }

          const tbody = document.createElement("tbody");
          tbody.id = "defensivePerformanceTableBody" + i;
          document
            .getElementById("defensivePerformance" + i)
            .appendChild(tbody);

          if (defensivePerformance[i].defensivePosition === "捕手") {
            // idとplayerIdとpositionの3項目を除いて項目の回数for文を回す
            for (
              let defensiveTd = 1;
              defensiveTd <= Object.keys(defensivePerformance[i]).length - 3;
              defensiveTd++
            ) {
              const td = document.createElement("td");
              let game = 1;
              let putOut = 2;
              let killing = 3;
              let error = 4;
              let doublePlay = 5;
              let passedBall = 6;
              let fieldingPercentage = 7;
              switch (defensiveTd) {
                case game:
                  td.innerText = defensivePerformance[i].game;
                  break;
                case putOut:
                  td.innerText = defensivePerformance[i].putOut;
                  break;
                case killing:
                  td.innerText = defensivePerformance[i].killing;
                  break;
                case error:
                  td.innerText = defensivePerformance[i].error;
                  break;
                case doublePlay:
                  td.innerText = defensivePerformance[i].doublePlay;
                  break;
                case passedBall:
                  td.innerText = defensivePerformance[i].passedBall;
                  break;
                case fieldingPercentage:
                  td.innerText = defensivePerformance[i].fieldingPercentage;
                  break;
              }
              document
                .getElementById("defensivePerformanceTableBody" + i)
                .appendChild(td);
            }
          } else {
            // idとplayerIdとpositionとpassedBallの4項目を除いて項目の回数for文を回す
            for (
              let defensiveTd = 1;
              defensiveTd <= Object.keys(defensivePerformance[i]).length - 4;
              defensiveTd++
            ) {
              const td = document.createElement("td");
              let game = 1;
              let putOut = 2;
              let killing = 3;
              let error = 4;
              let doublePlay = 5;
              let fieldingPercentage = 6;
              switch (defensiveTd) {
                case game:
                  td.innerText = defensivePerformance[i].game;
                  break;
                case putOut:
                  td.innerText = defensivePerformance[i].putOut;
                  break;
                case killing:
                  td.innerText = defensivePerformance[i].killing;
                  break;
                case error:
                  td.innerText = defensivePerformance[i].error;
                  break;
                case doublePlay:
                  td.innerText = defensivePerformance[i].doublePlay;
                  break;
                case fieldingPercentage:
                  td.innerText = defensivePerformance[i].fieldingPercentage;
                  break;
              }
              document
                .getElementById("defensivePerformanceTableBody" + i)
                .appendChild(td);
            }
          }
        }
      }
    }

    // 検索(input)リセット
    document.getElementById("number-input").value = "";
  } catch {
    pageReset();
    document.getElementById("number-input").value = "";
    return alert("その選手は存在しません");
  }
}
