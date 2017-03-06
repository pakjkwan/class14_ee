-- seq,pat_id,title,content,regdate(2017-02-15),read_count --
--CREATE SEQUENCE
CREATE SEQUENCE art_seq
START WITH 1
INCREMENT BY 1
NOCACHE
NOCYCLE;

--CREATE TABLE Article
CREATE TABLE Article(
	art_seq DECIMAL NOT NULL PRIMARY KEY,
	pat_id VARCHAR2(10) NOT NULL,
	title VARCHAR2(10) NOT NULL,
	content VARCHAR2(100)NOT NULL,
	regdate VARCHAR2(10) NOT NULL,
	readCount DECIMAL NOT NULL,
	FOREIGN KEY(pat_id) REFERENCES Patient(pat_id)
	
)
--INSERT
INSERT INTO Article (art_seq, pat_id, title, content, regdate, readCount)
VALUES(art_seq.nextval, 'hong', '안녕', '안녕하세요?홍길동 입니다.', '2017-02-15',1);
INSERT INTO Article (art_seq, pat_id, title, content, regdate, readCount)
VALUES(art_seq.nextval, 'kim', 'aaa', '안녕하세요?한빛 병원입니다.', '2017-02-15',1);
INSERT INTO Article (art_seq, pat_id, title, content, regdate, readCount)
VALUES(art_seq.nextval, 'lee', 'bbb', 'bbb', '2017-02-15',1);
INSERT INTO Article (art_seq, pat_id, title, content, regdate, readCount)
VALUES(art_seq.nextval, 'song', 'ccc', 'ccc', '2017-02-15',1);
INSERT INTO Article (art_seq, pat_id, title, content, regdate, readCount)
VALUES(art_seq.nextval, 'soo', 'ddd', 'ddd', '2017-02-15',1);
INSERT INTO Article (art_seq, pat_id, title, content, regdate, readCount)
VALUES(art_seq.nextval, 'hong', '안녕', '안녕하세요?홍길동 입니다.', '2017-02-15',1);
INSERT INTO Article (art_seq, pat_id, name, title, content, regdate, readCount)
VALUES(art_seq.nextval, 'hong', '병원', '병원 후기', '2017-02-15',1);
INSERT INTO Article (art_seq, pat_id, title, content, regdate, readCount)
VALUES(art_seq.nextval, 'hong', 'jjjj', 'jjjj', '2017-02-15',5);
INSERT INTO Article (art_seq, pat_id, title, content, regdate, readCount)
VALUES(art_seq.nextval, 'hong', 'ccc', 'ccc', '2017-02-15',7);
INSERT INTO Article (art_seq, pat_id, title, content, regdate, readCount)
VALUES(art_seq.nextval, 'hong', 'dddrrr', 'rrrrr', '2017-02-15',1);
--
INSERT INTO Article (art_seq, pat_id, title, content, regdate, readCount)
VALUES(art_seq.nextval, 'hong', '잘가', '잘먹고 잘살아라 ㅠㅠ', '2017-02-15',1);
INSERT INTO Article (art_seq, pat_id, title, content, regdate, readCount)
VALUES(art_seq.nextval, 'kim', '그들은', '그들은 그것은 것이 끝에 안고, 황금시대다', '2017-01-02',1);
INSERT INTO Article (art_seq, pat_id, title, content, regdate, readCount)
VALUES(art_seq.nextval, 'lee', '새 열락', '그들은 그것은 것이 끝에 안고, 황금시대다', '2017-03-07',1);
INSERT INTO Article (art_seq, pat_id, title, content, regdate, readCount)
VALUES(art_seq.nextval, 'song', '그것은 것이 끝에', '그들은 그것은 것이 끝에 안고, 황금시대다', '2017-02-22',1);
INSERT INTO Article (art_seq, pat_id, title, content, regdate, readCount)
VALUES(art_seq.nextval, 'soo', '끝에 안고', '그들은 그것은 것이 끝에 안고, 황금시대다', '2017-02-17',1);
INSERT INTO Article (art_seq, pat_id, title, content, regdate, readCount)
VALUES(art_seq.nextval, 'hong', '안녕', '그들은 그것은 것이 끝에 안고, 황금시대다', '2017-02-01',1);
INSERT INTO Article (art_seq, pat_id, title, content, regdate, readCount)
VALUES(art_seq.nextval, 'hong', '유소년', '유소년에게서 인생의 없으면, 싶이 가는 부패뿐이다', '2017-02-30',1);
INSERT INTO Article (art_seq, pat_id, title, content, regdate, readCount)
VALUES(art_seq.nextval, 'hong', '인생의', '유소년에게서 인생의 없으면,', '2017-02-08',5);
INSERT INTO Article (art_seq, pat_id, title, content, regdate, readCount)
VALUES(art_seq.nextval, 'hong', '청춘 발휘', '청춘 발휘하기 그들은 이것이다.', '2017-02-09',7);
INSERT INTO Article (art_seq, pat_id, title, content, regdate, readCount)
VALUES(art_seq.nextval, 'hong', '그들은', '청춘 발휘하기 그들은 이것이다', '2017-02-03',1);
--
INSERT INTO Article (art_seq, pat_id, title, content, regdate, readCount)
VALUES(art_seq.nextval, 'hong', '튼튼하며', '투명하되 굳세게 미묘한 그들의 말이다', '2017-02-15',1);
INSERT INTO Article (art_seq, pat_id, title, content, regdate, readCount)
VALUES(art_seq.nextval, 'kim', '튼튼', '영원히 없는 영락과', '2017-01-02',1);
INSERT INTO Article (art_seq, pat_id, title, content, regdate, readCount)
VALUES(art_seq.nextval, 'lee', '끝까지', '이상은 석가는 대중을', '2017-03-07',1);
INSERT INTO Article (art_seq, pat_id, title, content, regdate, readCount)
VALUES(art_seq.nextval, 'song', '피가 부패', '이상은 석가는 대중을', '2017-02-22',1);
INSERT INTO Article (art_seq, pat_id, title, content, regdate, readCount)
VALUES(art_seq.nextval, 'soo', '투명하되', '영원히 없는 영락', '2017-02-17',1);
INSERT INTO Article (art_seq, pat_id, title, content, regdate, readCount)
VALUES(art_seq.nextval, 'hong', '미묘한', '그들의 말이다', '2017-02-01',1);
INSERT INTO Article (art_seq, pat_id, title, content, regdate, readCount)
VALUES(art_seq.nextval, 'hong', '영원히', '그들의 말이다', '2017-02-30',1);
INSERT INTO Article (art_seq, pat_id, title, content, regdate, readCount)
VALUES(art_seq.nextval, 'hong', '영락과', '투명하되 굳세게', '2017-02-08',5);
INSERT INTO Article (art_seq, pat_id, title, content, regdate, readCount)
VALUES(art_seq.nextval, 'hong', '이상은', '끝까지 피가 부패뿐이다', '2017-02-09',7);
INSERT INTO Article (art_seq, pat_id, title, content, regdate, readCount)
VALUES(art_seq.nextval, 'hong', '석가는', '이상은 석가는 대중을 것이다', '2017-02-03',1);
--READ ALL
SELECT art_seq, pat_id, title, content, regdate, readCount  FROM Article;
--READ SOME
SELECT * FROM Article WHERE pat_id = 'hong';
--READ ONE
SELECT * FROM Article WHERE art_seq=1;
--UPDATE
UPDATE Article SET content = '자유게시판' WHERE pat_id='hong';
--DELETE
DELETE FROM Article WHERE hong = 'hong';

SELECT art_seq,pat_id,title,content,regdate,readCount  FROM Article WHERE title LIKE '%안%';

SELECT COUNT(*) AS count FROM Article;

SELECT t2.*
FROM (SELECT ROWNUM seq,t.* 
FROM (SELECT * FROM ARTICLE ORDER BY art_seq DESC) t) t2
WHERE t2.seq BETWEEN 11 AND 15;

SELECT t2.*	FROM (SELECT ROWNUM seq,t.*	FROM (SELECT * FROM ARTICLE ORDER BY art_seq DESC) t) t2	WHERE t2.seq BETWEEN 1 AND 5;
















