SELECT *  FROM sungjuk;

--국어점수 60이상 조회
select *
from sungjuk
where kor>=60;

select * from TB_STUDENT;

--행추가
insert into sungjuk(sno, uname, kor, eng, mat, addr, wdate)
values(sungjuk_seq.nextval, '박지성', 99, 32, 22, 'Suwon', sysdate);