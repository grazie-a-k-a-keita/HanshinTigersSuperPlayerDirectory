--------------------------------------------------------------------------------
-- player �̃��C�A�E�g�ύX
--   ���ӁI�I�F�e�[�u���Ɉˑ�����I�u�W�F�N�g�i�r���[�Ȃǁj���폜�����ꍇ������܂��B�����̃I�u�W�F�N�g�͕�������܂���B
--   2022/05/11 ono
--------------------------------------------------------------------------------


-- �V�e�[�u���̍쐬
create table player (
  id serial not null
  , back_number integer not null
  , name varchar(100) not null
  , face_picture varchar(100)
)
/


-- ��L�[�̍쐬
alter table player  add primary key (id)
/


-- �R�����g�̍쐬
comment on table player is '��_ �I��'
/

comment on column player.id is '�I��ID'
/

comment on column player.back_number is '�w�ԍ�'
/

comment on column player.name is '�I�薼'
/

comment on column player.face_picture is '��ʐ^'
/

