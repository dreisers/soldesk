select * from sungjuk;

--�̸��� ?? ���ڰ� ���Ե� ���� ����
delete from sungjuk
where uname like  '%?%';

-- ���߰� 
insert into sungjuk(uname, kor, eng, mat, regdt)
values( '�迬��', 88, 55, 44,  now());