--���� ������ ����
create sequence sungjuk_seq;

create table sungjuk(
    sno      int primary key,   -- �Ϸù�ȣ
    uname    varchar(20),    -- �̸�
    kor      int not null,   -- ����
    eng      int not null,   -- ����
    mat      int not null,   -- ����
    aver     int,            -- ���
    addr     varchar(50),    -- �ּ�
    wdate    date            -- �ۼ���
);

-- ���߰� (�Ϸó�ȣ snoĮ�� �Է��ҋ�)
-- 1) ������
insert into sungjuk(sno,uname,kor,eng,mat,addr,wdate)
values (sungjuk_seq.nextval,'ȫ�浿',50,60,30,'Seoul',sysdate);
-- 2) max() �ִ밪 +1 
insert into sungjuk(sno,uname,kor,eng,mat,addr,wdate)
values ((select nvl(max(sno),0)+1 from sungjuk),'������',44,55,66,'����',sysdate);

select * from sungjuk order by sno desc;

-- �󼼺���
select * 
from sungjuk where sno = 4;

-- ���� 
update sungjuk
set uname = , kor=, eng=, mat=, aver=, addr=
where sno=4;

--����
delete sungjuk where sno=4;