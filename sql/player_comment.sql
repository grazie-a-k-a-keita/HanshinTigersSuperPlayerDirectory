--------------------------------------------------------------------------------
-- player_comment のレイアウト変更
--   注意！！：テーブルに依存するオブジェクト（ビューなど）が削除される場合があります。それらのオブジェクトは復元されません。
--   2022/05/11 ono
--------------------------------------------------------------------------------


-- 新テーブルの作成
create table player_comment (
  id serial not null
  , player_id integer not null
  , context text
  , create_at timestamp
)
/


-- 主キーの作成
alter table player_comment  add primary key (id)
/


-- コメントの作成
comment on table player_comment is '選手 コメント'
/

comment on column player_comment.id is 'コメントID'
/

comment on column player_comment.player_id is '選手ID'
/

comment on column player_comment.context is 'コメント内容'
/

comment on column player_comment.create_at is '作成日時'
/


-- 外部キーの作成
alter table player_comment
  add constraint player_id  foreign key (player_id)
  references player(id)
/

