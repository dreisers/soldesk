--성적 시퀀스 생성
create sequence sungjuk_seq;

create table sungjuk(
    sno      int primary key,   -- 일련번호
    uname    varchar(20),    -- 이름
    kor      int not null,   -- 국어
    eng      int not null,   -- 영어
    mat      int not null,   -- 수학
    aver     int,            -- 평균
    addr     varchar(50),    -- 주소
    wdate    date            -- 작성일
);

-- 행추가 (일련넘호 sno칼럼 입력할떄)
-- 1) 시퀀스
insert into sungjuk(sno,uname,kor,eng,mat,addr,wdate)
values (sungjuk_seq.nextval,'홍길동',50,60,30,'Seoul',sysdate);
-- 2) max() 최대값 +1 
insert into sungjuk(sno,uname,kor,eng,mat,addr,wdate)
values ((select nvl(max(sno),0)+1 from sungjuk),'박지성',44,55,66,'수원',sysdate);

select * from sungjuk order by sno desc;

-- 상세보기
select * 
from sungjuk where sno = 4;

-- 수정 
update sungjuk
set uname = , kor=, eng=, mat=, aver=, addr=
where sno=4;

--삭제
delete sungjuk where sno=4;