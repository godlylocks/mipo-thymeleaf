-- noinspection SqlNoDataSourceInspectionForFile

-- noinspection SqlDialectInspectionForFile

INSERT INTO ORGANISM_TABLE (ORGANISM_NAME)
VALUES ('Nocardia');

INSERT INTO ORGANISM_TABLE (ORGANISM_NAME)
VALUES ('Mycobacterium');

INSERT INTO QUESTION_TABLE (QUESTION_TEXT)
VALUES ('What color?');

INSERT INTO QUESTION_TABLE (QUESTION_TEXT)
VALUES ('What shape?');

INSERT INTO ANSWER_TABLE (ANSWER_TEXT)
VALUES ('red');

INSERT INTO ANSWER_TABLE (ANSWER_TEXT)
VALUES ('blue');

INSERT INTO ANSWER_TABLE (ANSWER_TEXT)
VALUES ('round');

INSERT INTO ANSWER_TABLE (ANSWER_TEXT)
VALUES ('rod-like');

INSERT INTO ORGANISM_HAS_QUESTION (ORGANISM_ID, QUESTION_ID)
VALUES (1,1);


