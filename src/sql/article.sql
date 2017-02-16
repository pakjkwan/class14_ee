-- seq,id,title,content,regdate(2017-02-15),read_count --
--CREATE SEQUENCE
CREATE SEQUENCE art_seq
START WITH 1
INCREMENT BY 1
NOCACHE
NOCYCLE;

--CREATE TABLE Article
CREATE TABLE Article(
	art_seq DECIMAL NOT NULL PRIMARY KEY,
	id VARCHAR2(10) NOT NULL,
	name VARCHAR2(10) NOT NULL,
	title VARCHAR2(10) NOT NULL,
	content VARCHAR2(100)NOT NULL,
	regdate VARCHAR2(10) NOT NULL,
	readCount DECIMAL NOT NULL
)
--INSERT
INSERT INTO Article (art_seq, id, name, title, content, regdate, readCount)
VALUES(art_seq.nextval, 'hong', '홍길동', '안녕', '안녕하세요?홍길동 입니다.', '2017-02-15',1);
INSERT INTO Article (art_seq, id, name, title, content, regdate, readCount)
VALUES(art_seq.nextval, 'kim', '김유신', 'aaa', '안녕하세요?한빛 병원입니다.', '2017-02-15',1);
INSERT INTO Article (art_seq, id, name, title, content, regdate, readCount)
VALUES(art_seq.nextval, 'lee', '이순신', 'bbb', 'bbb', '2017-02-15',1);
INSERT INTO Article (art_seq, id, name, title, content, regdate, readCount)
VALUES(art_seq.nextval, 'song', '송시열', 'ccc', 'ccc', '2017-02-15',1);
INSERT INTO Article (art_seq, id, name, title, content, regdate, readCount)
VALUES(art_seq.nextval, 'soo', '박승수', 'ddd', 'ddd', '2017-02-15',1);
INSERT INTO Article (art_seq, id, name, title, content, regdate, readCount)
VALUES(art_seq.nextval, 'hong', '홍길동', '안녕', '안녕하세요?홍길동 입니다.', '2017-02-15',1);
INSERT INTO Article (art_seq, id, name, title, content, regdate, readCount)
VALUES(art_seq.nextval, 'hong', '홍길동', '병원', '병원 후기', '2017-02-15',1);
INSERT INTO Article (art_seq, id, name, title, content, regdate, readCount)
VALUES(art_seq.nextval, 'hong', '홍길동', 'jjjj', 'jjjj', '2017-02-15',5);
INSERT INTO Article (art_seq, id, name, title, content, regdate, readCount)
VALUES(art_seq.nextval, 'hong', '홍길동', 'ccc', 'ccc', '2017-02-15',7);
INSERT INTO Article (art_seq, id, name, title, content, regdate, readCount)
VALUES(art_seq.nextval, 'hong', '홍길동', 'dddrrr', 'rrrrr', '2017-02-15',1);
--READ ALL
SELECT * FROM Article;
--READ SOME
SELECT * FROM Article WHERE id = 'hong';
--READ ONE
SELECT * FROM Article WHERE art_seq=1;
--UPDATE
UPDATE Article SET content = '자유게시판' WHERE id='hong';
--DELETE
DELETE FROM Article WHERE hong = 'hong';

SELECT art_seq,id,title,content,regdate,readCount  FROM Article WHERE title LIKE '%안%';


