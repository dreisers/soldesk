select * from sungjuk;

--이름에 ?? 글자가 포함된 행을 삭제
delete from sungjuk
where uname like  '%?%';

-- 행추가 
insert into sungjuk(uname, kor, eng, mat, regdt)
values( '김연아', 88, 55, 44,  now());