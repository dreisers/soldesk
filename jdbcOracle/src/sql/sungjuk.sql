SELECT *  FROM sungjuk;

--�������� 60�̻� ��ȸ
select *
from sungjuk
where kor>=60;

select * from TB_STUDENT;

--���߰�
insert into sungjuk(sno, uname, kor, eng, mat, addr, wdate)
values(sungjuk_seq.nextval, '������', 99, 32, 22, 'Suwon', sysdate);