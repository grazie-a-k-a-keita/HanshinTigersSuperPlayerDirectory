--------------------------------------------------------------------------------
-- player のレイアウト変更
--   注意！！：テーブルに依存するオブジェクト（ビューなど）が削除される場合があります。それらのオブジェクトは復元されません。
--   2022/05/11 ono
--------------------------------------------------------------------------------


-- 新テーブルの作成
create table player (
  id serial not null
  , back_number integer not null
  , name varchar(100) not null
  , face_picture varchar(100)
)
/


-- 主キーの作成
alter table player  add primary key (id)
/


-- コメントの作成
comment on table player is '阪神 選手'
/

comment on column player.id is '選手ID'
/

comment on column player.back_number is '背番号'
/

comment on column player.name is '選手名'
/

comment on column player.face_picture is '顔写真'
/

