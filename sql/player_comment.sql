--------------------------------------------------------------------------------
-- player_comment �̃��C�A�E�g�ύX
--   ���ӁI�I�F�e�[�u���Ɉˑ�����I�u�W�F�N�g�i�r���[�Ȃǁj���폜�����ꍇ������܂��B�����̃I�u�W�F�N�g�͕�������܂���B
--   2022/05/11 ono
--------------------------------------------------------------------------------


-- �V�e�[�u���̍쐬
create table player_comment (
  id serial not null
  , player_id integer not null
  , context text
  , create_at timestamp
)
/


-- ��L�[�̍쐬
alter table player_comment  add primary key (id)
/


-- �R�����g�̍쐬
comment on table player_comment is '�I�� �R�����g'
/

comment on column player_comment.id is '�R�����gID'
/

comment on column player_comment.player_id is '�I��ID'
/

comment on column player_comment.context is '�R�����g���e'
/

comment on column player_comment.create_at is '�쐬����'
/


-- �O���L�[�̍쐬
alter table player_comment
  add constraint player_id  foreign key (player_id)
  references player(id)
/

