CREATE TABLE Resume
(
  id int IDENTITY,
  name varchar(80),
  title varchar(100),
  address varchar(255),
  phone varchar(10),
  email varchar(100)
);
GO
INSERT INTO RESUME
  (name, title, address, phone, email)
VALUES
  (NEWID(), 'Nathan Collins', 'Senior Full Stack Software Engineer', '0410009778', 'nathan@ndcvisions.net');
GO
CREATE TABLE Overview
(
  id int IDENTITY,
  resumeId int,
  description varchar(200)
);
GO
SELECT id
FROM Resume
WHERE name = 'Nathan Collins';
SET @resumeId = id;
CREATE TABLE Skills
(
  name varchar(150),
  skill varchar(100),
)
GO
