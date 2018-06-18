--------------------------------------------------------
--  File creato - luned�-giugno-18-2018   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table CANE
--------------------------------------------------------

  CREATE TABLE "MARTINO"."CANE" 
   (	"ID_CANE" NUMBER, 
	"TAGLIA" VARCHAR2(40 BYTE), 
	"CHIP" VARCHAR2(40 BYTE), 
	"SESSO" VARCHAR2(40 BYTE), 
	"CANE_IMMAGINE" VARCHAR2(40 BYTE), 
	"PELO" VARCHAR2(40 BYTE), 
	"DATA_NASCITA" DATE, 
	"PEDEGREE" NUMBER(3,0), 
	"ID_UTENTE" NUMBER, 
	"ID_RAZZA" NUMBER, 
	"NOME" VARCHAR2(20 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table DOG_FRIENDLY
--------------------------------------------------------

  CREATE TABLE "MARTINO"."DOG_FRIENDLY" 
   (	"ID_FRIENDLY" NUMBER, 
	"NOMEATTIVITA" VARCHAR2(40 BYTE), 
	"INDIRIZZO" VARCHAR2(40 BYTE), 
	"ID_ATTIVITA" NUMBER
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table RAZZE
--------------------------------------------------------

  CREATE TABLE "MARTINO"."RAZZE" 
   (	"ID_RAZZA" NUMBER, 
	"RAZZA" VARCHAR2(40 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table RUOLO
--------------------------------------------------------

  CREATE TABLE "MARTINO"."RUOLO" 
   (	"ID_RUOLO" NUMBER, 
	"NOME" VARCHAR2(40 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table TIPO_ATTIVITA
--------------------------------------------------------

  CREATE TABLE "MARTINO"."TIPO_ATTIVITA" 
   (	"ID_ATTIVITA" NUMBER, 
	"TIPO" VARCHAR2(40 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table UTENTE
--------------------------------------------------------

  CREATE TABLE "MARTINO"."UTENTE" 
   (	"ID_UTENTE" NUMBER, 
	"NOME" VARCHAR2(40 BYTE), 
	"COGNOME" VARCHAR2(40 BYTE), 
	"SESSO" VARCHAR2(40 BYTE), 
	"USERNAME" VARCHAR2(40 BYTE), 
	"PASSWORD" VARCHAR2(40 BYTE), 
	"CITTA" VARCHAR2(40 BYTE), 
	"UTENTE_IMMAGINE" VARCHAR2(40 BYTE), 
	"INDIRIZZO" VARCHAR2(40 BYTE), 
	"VERIFICATO" NUMBER(3,0), 
	"MAIL" VARCHAR2(40 BYTE), 
	"NUMERO_TELEFONO" VARCHAR2(10 BYTE), 
	"DATA_NASCITA" DATE
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table UTENTE_RUOLO
--------------------------------------------------------

  CREATE TABLE "MARTINO"."UTENTE_RUOLO" 
   (	"ID_RUOLO" NUMBER, 
	"ID_UTENTE" NUMBER
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
REM INSERTING into MARTINO.CANE
SET DEFINE OFF;
Insert into MARTINO.CANE (ID_CANE,TAGLIA,CHIP,SESSO,CANE_IMMAGINE,PELO,DATA_NASCITA,PEDEGREE,ID_UTENTE,ID_RAZZA,NOME) values ('23','Mario',null,'maschio',null,'lungo',null,'1','1','1','prova1');
Insert into MARTINO.CANE (ID_CANE,TAGLIA,CHIP,SESSO,CANE_IMMAGINE,PELO,DATA_NASCITA,PEDEGREE,ID_UTENTE,ID_RAZZA,NOME) values ('62','s','s','male','foto','ww',to_date('11-DIC-19','DD-MON-RR'),'1','3','3','Mario');
Insert into MARTINO.CANE (ID_CANE,TAGLIA,CHIP,SESSO,CANE_IMMAGINE,PELO,DATA_NASCITA,PEDEGREE,ID_UTENTE,ID_RAZZA,NOME) values ('63','asdfghjk','asdfghjk','male','foto','ww',to_date('11-DIC-19','DD-MON-RR'),'1','3','3','Mario');
Insert into MARTINO.CANE (ID_CANE,TAGLIA,CHIP,SESSO,CANE_IMMAGINE,PELO,DATA_NASCITA,PEDEGREE,ID_UTENTE,ID_RAZZA,NOME) values ('68','piccola','mariomariomaro','male','foto','corto',to_date('12-DIC-00','DD-MON-RR'),'1','3','3','mario');
Insert into MARTINO.CANE (ID_CANE,TAGLIA,CHIP,SESSO,CANE_IMMAGINE,PELO,DATA_NASCITA,PEDEGREE,ID_UTENTE,ID_RAZZA,NOME) values ('83','jhgfds','jhgfdswq','altro',null,'hgfdwq',to_date('24-FEB-99','DD-MON-RR'),'0','1','1','prova2');
Insert into MARTINO.CANE (ID_CANE,TAGLIA,CHIP,SESSO,CANE_IMMAGINE,PELO,DATA_NASCITA,PEDEGREE,ID_UTENTE,ID_RAZZA,NOME) values ('66','si','si','male','foto','si',to_date('12-DIC-00','DD-MON-RR'),'1','3','3','Mario');
Insert into MARTINO.CANE (ID_CANE,TAGLIA,CHIP,SESSO,CANE_IMMAGINE,PELO,DATA_NASCITA,PEDEGREE,ID_UTENTE,ID_RAZZA,NOME) values ('67','no','no','male','foto','no',to_date('12-DIC-00','DD-MON-RR'),'2','3','3','Mario');
Insert into MARTINO.CANE (ID_CANE,TAGLIA,CHIP,SESSO,CANE_IMMAGINE,PELO,DATA_NASCITA,PEDEGREE,ID_UTENTE,ID_RAZZA,NOME) values ('84','ertyui','sdfghj','femmina',null,'dfghjkl',to_date('14-MAG-00','DD-MON-RR'),'0','1','1','prova3');
Insert into MARTINO.CANE (ID_CANE,TAGLIA,CHIP,SESSO,CANE_IMMAGINE,PELO,DATA_NASCITA,PEDEGREE,ID_UTENTE,ID_RAZZA,NOME) values ('85','rty','tyuiy','altro',null,'yui',to_date('12-DIC-90','DD-MON-RR'),'0','1','1','prova4');
Insert into MARTINO.CANE (ID_CANE,TAGLIA,CHIP,SESSO,CANE_IMMAGINE,PELO,DATA_NASCITA,PEDEGREE,ID_UTENTE,ID_RAZZA,NOME) values ('86','rty','tyuiy','altro',null,'yui',to_date('12-DIC-90','DD-MON-RR'),'0','1','1','ewq');
Insert into MARTINO.CANE (ID_CANE,TAGLIA,CHIP,SESSO,CANE_IMMAGINE,PELO,DATA_NASCITA,PEDEGREE,ID_UTENTE,ID_RAZZA,NOME) values ('87','uio','ipo','altro',null,'iop',to_date('12-DIC-90','DD-MON-RR'),'0','1','1','uio');
Insert into MARTINO.CANE (ID_CANE,TAGLIA,CHIP,SESSO,CANE_IMMAGINE,PELO,DATA_NASCITA,PEDEGREE,ID_UTENTE,ID_RAZZA,NOME) values ('88','uio','ipo','altro',null,'iop',to_date('12-DIC-90','DD-MON-RR'),'0','1','1','uio');
Insert into MARTINO.CANE (ID_CANE,TAGLIA,CHIP,SESSO,CANE_IMMAGINE,PELO,DATA_NASCITA,PEDEGREE,ID_UTENTE,ID_RAZZA,NOME) values ('89','uio','ipo','altro',null,'iop',to_date('12-DIC-90','DD-MON-RR'),'0','1','1','uio');
Insert into MARTINO.CANE (ID_CANE,TAGLIA,CHIP,SESSO,CANE_IMMAGINE,PELO,DATA_NASCITA,PEDEGREE,ID_UTENTE,ID_RAZZA,NOME) values ('90','iop','iop','altro',null,'iop',to_date('12-DIC-90','DD-MON-RR'),'0','1','1','iop');
Insert into MARTINO.CANE (ID_CANE,TAGLIA,CHIP,SESSO,CANE_IMMAGINE,PELO,DATA_NASCITA,PEDEGREE,ID_UTENTE,ID_RAZZA,NOME) values ('91','iop','iop','altro',null,'iop',to_date('12-DIC-90','DD-MON-RR'),'0','1','1','iop');
Insert into MARTINO.CANE (ID_CANE,TAGLIA,CHIP,SESSO,CANE_IMMAGINE,PELO,DATA_NASCITA,PEDEGREE,ID_UTENTE,ID_RAZZA,NOME) values ('92','iop','iop','altro',null,'iop',to_date('12-DIC-90','DD-MON-RR'),'0','1','1','iop');
Insert into MARTINO.CANE (ID_CANE,TAGLIA,CHIP,SESSO,CANE_IMMAGINE,PELO,DATA_NASCITA,PEDEGREE,ID_UTENTE,ID_RAZZA,NOME) values ('93','media','mkiolkjhyuikloi','maschio',null,'corto',to_date('14-MAG-00','DD-MON-RR'),'0','1','1','Rex');
Insert into MARTINO.CANE (ID_CANE,TAGLIA,CHIP,SESSO,CANE_IMMAGINE,PELO,DATA_NASCITA,PEDEGREE,ID_UTENTE,ID_RAZZA,NOME) values ('50','piccola','qwertyu','male',null,'lungo',to_date('25-MAG-99','DD-MON-RR'),'1','2','2',null);
Insert into MARTINO.CANE (ID_CANE,TAGLIA,CHIP,SESSO,CANE_IMMAGINE,PELO,DATA_NASCITA,PEDEGREE,ID_UTENTE,ID_RAZZA,NOME) values ('47','piccola','gfdsa','maschio','foto','corto',to_date('22-DIC-00','DD-MON-RR'),'2','1','1',null);
Insert into MARTINO.CANE (ID_CANE,TAGLIA,CHIP,SESSO,CANE_IMMAGINE,PELO,DATA_NASCITA,PEDEGREE,ID_UTENTE,ID_RAZZA,NOME) values ('61','prova','prova','altro',null,'prova',to_date('14-LUG-09','DD-MON-RR'),'0','1','1','luigi');
REM INSERTING into MARTINO.DOG_FRIENDLY
SET DEFINE OFF;
Insert into MARTINO.DOG_FRIENDLY (ID_FRIENDLY,NOMEATTIVITA,INDIRIZZO,ID_ATTIVITA) values ('1','prova','prova','2');
Insert into MARTINO.DOG_FRIENDLY (ID_FRIENDLY,NOMEATTIVITA,INDIRIZZO,ID_ATTIVITA) values ('2',' PIZZERIAdog ','via ....','2');
Insert into MARTINO.DOG_FRIENDLY (ID_FRIENDLY,NOMEATTIVITA,INDIRIZZO,ID_ATTIVITA) values ('3',' NEGOZIOdog ','via ....','3');
Insert into MARTINO.DOG_FRIENDLY (ID_FRIENDLY,NOMEATTIVITA,INDIRIZZO,ID_ATTIVITA) values ('4',' CAFFETTERIAdog ','via ....','4');
Insert into MARTINO.DOG_FRIENDLY (ID_FRIENDLY,NOMEATTIVITA,INDIRIZZO,ID_ATTIVITA) values ('5',' GELATERIAdog ','via ....','5');
Insert into MARTINO.DOG_FRIENDLY (ID_FRIENDLY,NOMEATTIVITA,INDIRIZZO,ID_ATTIVITA) values ('6',' RISTORANTEdog ','via ....','6');
Insert into MARTINO.DOG_FRIENDLY (ID_FRIENDLY,NOMEATTIVITA,INDIRIZZO,ID_ATTIVITA) values ('7',' PISCINAdog ','via ....','7');
Insert into MARTINO.DOG_FRIENDLY (ID_FRIENDLY,NOMEATTIVITA,INDIRIZZO,ID_ATTIVITA) values ('8',' SPIAGGIAdog ','via ....','8');
Insert into MARTINO.DOG_FRIENDLY (ID_FRIENDLY,NOMEATTIVITA,INDIRIZZO,ID_ATTIVITA) values ('9',' CAMPEGGIOdog ','via ....','9');
Insert into MARTINO.DOG_FRIENDLY (ID_FRIENDLY,NOMEATTIVITA,INDIRIZZO,ID_ATTIVITA) values ('12','KASDLK','KLSAJDLSK','1');
Insert into MARTINO.DOG_FRIENDLY (ID_FRIENDLY,NOMEATTIVITA,INDIRIZZO,ID_ATTIVITA) values ('13','da gioulio','roma via casa','4');
REM INSERTING into MARTINO.RAZZE
SET DEFINE OFF;
Insert into MARTINO.RAZZE (ID_RAZZA,RAZZA) values ('1','ALTRO');
Insert into MARTINO.RAZZE (ID_RAZZA,RAZZA) values ('2','AFFENPINSCHER');
Insert into MARTINO.RAZZE (ID_RAZZA,RAZZA) values ('3',' TERRIER');
Insert into MARTINO.RAZZE (ID_RAZZA,RAZZA) values ('4','AKITA');
Insert into MARTINO.RAZZE (ID_RAZZA,RAZZA) values ('5','ALANO');
Insert into MARTINO.RAZZE (ID_RAZZA,RAZZA) values ('6','ALASKAN');
Insert into MARTINO.RAZZE (ID_RAZZA,RAZZA) values ('7','ALPENLAENDISCHE');
Insert into MARTINO.RAZZE (ID_RAZZA,RAZZA) values ('8','SHEPHERD');
Insert into MARTINO.RAZZE (ID_RAZZA,RAZZA) values ('9','AZAWAKH');
Insert into MARTINO.RAZZE (ID_RAZZA,RAZZA) values ('10','BARBET');
Insert into MARTINO.RAZZE (ID_RAZZA,RAZZA) values ('11','BASENJI');
Insert into MARTINO.RAZZE (ID_RAZZA,RAZZA) values ('12','BARZOI');
Insert into MARTINO.RAZZE (ID_RAZZA,RAZZA) values ('13','BASSETT');
Insert into MARTINO.RAZZE (ID_RAZZA,RAZZA) values ('14','BASSOTTI');
Insert into MARTINO.RAZZE (ID_RAZZA,RAZZA) values ('15','BEAGLE');
Insert into MARTINO.RAZZE (ID_RAZZA,RAZZA) values ('16','COLLIE');
Insert into MARTINO.RAZZE (ID_RAZZA,RAZZA) values ('17','BOULEDOGUE');
Insert into MARTINO.RAZZE (ID_RAZZA,RAZZA) values ('18','BOVARO');
Insert into MARTINO.RAZZE (ID_RAZZA,RAZZA) values ('19','BOXER');
Insert into MARTINO.RAZZE (ID_RAZZA,RAZZA) values ('20','BRACCO');
Insert into MARTINO.RAZZE (ID_RAZZA,RAZZA) values ('21','BROHOLMER');
Insert into MARTINO.RAZZE (ID_RAZZA,RAZZA) values ('22','BULLDOG');
Insert into MARTINO.RAZZE (ID_RAZZA,RAZZA) values ('23','CANE DA PASTORE');
Insert into MARTINO.RAZZE (ID_RAZZA,RAZZA) values ('24','SAN BERNARDO');
Insert into MARTINO.RAZZE (ID_RAZZA,RAZZA) values ('25','CANE FONNESE');
Insert into MARTINO.RAZZE (ID_RAZZA,RAZZA) values ('26','CARLINO');
Insert into MARTINO.RAZZE (ID_RAZZA,RAZZA) values ('27','CAVALIER');
Insert into MARTINO.RAZZE (ID_RAZZA,RAZZA) values ('28','CHESAPEAKE');
Insert into MARTINO.RAZZE (ID_RAZZA,RAZZA) values ('29','CHIHUAHUA');
Insert into MARTINO.RAZZE (ID_RAZZA,RAZZA) values ('30','CHIN');
Insert into MARTINO.RAZZE (ID_RAZZA,RAZZA) values ('31','CHINESE CRESTED DOG');
Insert into MARTINO.RAZZE (ID_RAZZA,RAZZA) values ('32','CHOW-CHOW');
Insert into MARTINO.RAZZE (ID_RAZZA,RAZZA) values ('33','COCKER AMERICANO');
Insert into MARTINO.RAZZE (ID_RAZZA,RAZZA) values ('34','COCKER SPANIEL');
Insert into MARTINO.RAZZE (ID_RAZZA,RAZZA) values ('35','COTON DE TULEAR');
Insert into MARTINO.RAZZE (ID_RAZZA,RAZZA) values ('36','DALMATA');
Insert into MARTINO.RAZZE (ID_RAZZA,RAZZA) values ('37','DANDIE DINMONT TERRIER');
Insert into MARTINO.RAZZE (ID_RAZZA,RAZZA) values ('38',' DOBERMANN ');
Insert into MARTINO.RAZZE (ID_RAZZA,RAZZA) values ('39',' DOGO ');
Insert into MARTINO.RAZZE (ID_RAZZA,RAZZA) values ('40',' DOGUE DE BORDEAUX ');
Insert into MARTINO.RAZZE (ID_RAZZA,RAZZA) values ('41',' DREVER ');
Insert into MARTINO.RAZZE (ID_RAZZA,RAZZA) values ('42',' DUNKER ');
Insert into MARTINO.RAZZE (ID_RAZZA,RAZZA) values ('43',' EPAGNEUL ');
Insert into MARTINO.RAZZE (ID_RAZZA,RAZZA) values ('44',' EURASIER ');
Insert into MARTINO.RAZZE (ID_RAZZA,RAZZA) values ('45',' FOXHOUND ');
Insert into MARTINO.RAZZE (ID_RAZZA,RAZZA) values ('46',' FRANCAIS ');
Insert into MARTINO.RAZZE (ID_RAZZA,RAZZA) values ('47',' GALGO ESPANOL ');
Insert into MARTINO.RAZZE (ID_RAZZA,RAZZA) values ('48',' GAMMEL DANSK HONSENHUND ');
Insert into MARTINO.RAZZE (ID_RAZZA,RAZZA) values ('49',' GOLDEN RETRIEVER ');
Insert into MARTINO.RAZZE (ID_RAZZA,RAZZA) values ('50',' GONCZY POLSKI ');
Insert into MARTINO.RAZZE (ID_RAZZA,RAZZA) values ('51',' GRAND ANGLO FRANCAIS ');
Insert into MARTINO.RAZZE (ID_RAZZA,RAZZA) values ('52',' GREYHOUND ');
Insert into MARTINO.RAZZE (ID_RAZZA,RAZZA) values ('53',' GREYHOUND ');
Insert into MARTINO.RAZZE (ID_RAZZA,RAZZA) values ('54',' GRIFFON ');
Insert into MARTINO.RAZZE (ID_RAZZA,RAZZA) values ('55',' GROENLANDESE ');
Insert into MARTINO.RAZZE (ID_RAZZA,RAZZA) values ('56',' HALDENSTOVARE ');
Insert into MARTINO.RAZZE (ID_RAZZA,RAZZA) values ('57',' HAMILTON STOVARE ');
Insert into MARTINO.RAZZE (ID_RAZZA,RAZZA) values ('58',' HANNOVERISCHER SCHWEISSHUND ');
Insert into MARTINO.RAZZE (ID_RAZZA,RAZZA) values ('59',' HOKKAIDO ');
Insert into MARTINO.RAZZE (ID_RAZZA,RAZZA) values ('60',' HOVAWART ');
Insert into MARTINO.RAZZE (ID_RAZZA,RAZZA) values ('61',' HYGHENHUND ');
Insert into MARTINO.RAZZE (ID_RAZZA,RAZZA) values ('62',' IRISH ');
Insert into MARTINO.RAZZE (ID_RAZZA,RAZZA) values ('63',' KING CHARLES SPANIEL  ');
Insert into MARTINO.RAZZE (ID_RAZZA,RAZZA) values ('64',' KISHU ');
Insert into MARTINO.RAZZE (ID_RAZZA,RAZZA) values ('65',' KOMONDOR ');
Insert into MARTINO.RAZZE (ID_RAZZA,RAZZA) values ('66',' KOOIKERHONDJE ');
Insert into MARTINO.RAZZE (ID_RAZZA,RAZZA) values ('67',' MASTINO ');
Insert into MARTINO.RAZZE (ID_RAZZA,RAZZA) values ('68',' NORSK ');
Insert into MARTINO.RAZZE (ID_RAZZA,RAZZA) values ('69',' PASTORE TEDESCO ');
Insert into MARTINO.RAZZE (ID_RAZZA,RAZZA) values ('70',' CANE LEONE ');
Insert into MARTINO.RAZZE (ID_RAZZA,RAZZA) values ('71',' LEVRIERO ');
Insert into MARTINO.RAZZE (ID_RAZZA,RAZZA) values ('72',' SEGUGIO ');
Insert into MARTINO.RAZZE (ID_RAZZA,RAZZA) values ('73',' SETTER ');
Insert into MARTINO.RAZZE (ID_RAZZA,RAZZA) values ('74',' SHAR PEI ');
Insert into MARTINO.RAZZE (ID_RAZZA,RAZZA) values ('75',' SHIBA ');
Insert into MARTINO.RAZZE (ID_RAZZA,RAZZA) values ('76',' SHIKOKU ');
Insert into MARTINO.RAZZE (ID_RAZZA,RAZZA) values ('77',' SPANIEL ');
Insert into MARTINO.RAZZE (ID_RAZZA,RAZZA) values ('78',' SPINONE ');
Insert into MARTINO.RAZZE (ID_RAZZA,RAZZA) values ('79',' SPITZ ');
Insert into MARTINO.RAZZE (ID_RAZZA,RAZZA) values ('80',' TAIWAN DOG ');
Insert into MARTINO.RAZZE (ID_RAZZA,RAZZA) values ('81',' TERRANOVA ');
Insert into MARTINO.RAZZE (ID_RAZZA,RAZZA) values ('82',' TIBETAN ');
Insert into MARTINO.RAZZE (ID_RAZZA,RAZZA) values ('83',' VOLPINO ');
Insert into MARTINO.RAZZE (ID_RAZZA,RAZZA) values ('84',' WEIMARANER ');
Insert into MARTINO.RAZZE (ID_RAZZA,RAZZA) values ('85',' WELSH ');
Insert into MARTINO.RAZZE (ID_RAZZA,RAZZA) values ('86',' XOLOITZCUINTLE ');
Insert into MARTINO.RAZZE (ID_RAZZA,RAZZA) values ('87',' ZWERGSCHNAUZER ');
Insert into MARTINO.RAZZE (ID_RAZZA,RAZZA) values ('88','Chongqing');
REM INSERTING into MARTINO.RUOLO
SET DEFINE OFF;
Insert into MARTINO.RUOLO (ID_RUOLO,NOME) values ('0','ADMIN');
Insert into MARTINO.RUOLO (ID_RUOLO,NOME) values ('1','DIPENDENTE');
Insert into MARTINO.RUOLO (ID_RUOLO,NOME) values ('2','UTENTE');
Insert into MARTINO.RUOLO (ID_RUOLO,NOME) values ('3','DOGSITTER');
Insert into MARTINO.RUOLO (ID_RUOLO,NOME) values ('4','TOELETTATORE');
Insert into MARTINO.RUOLO (ID_RUOLO,NOME) values ('5','ADDESTRATORE');
REM INSERTING into MARTINO.TIPO_ATTIVITA
SET DEFINE OFF;
Insert into MARTINO.TIPO_ATTIVITA (ID_ATTIVITA,TIPO) values ('1',' HOTEL ');
Insert into MARTINO.TIPO_ATTIVITA (ID_ATTIVITA,TIPO) values ('2',' PIZZERIA ');
Insert into MARTINO.TIPO_ATTIVITA (ID_ATTIVITA,TIPO) values ('3',' NEGOZIO ');
Insert into MARTINO.TIPO_ATTIVITA (ID_ATTIVITA,TIPO) values ('4',' CAFFETTERIA ');
Insert into MARTINO.TIPO_ATTIVITA (ID_ATTIVITA,TIPO) values ('5',' GELATERIA ');
Insert into MARTINO.TIPO_ATTIVITA (ID_ATTIVITA,TIPO) values ('6',' RISTORANTE ');
Insert into MARTINO.TIPO_ATTIVITA (ID_ATTIVITA,TIPO) values ('7',' PISCINA ');
Insert into MARTINO.TIPO_ATTIVITA (ID_ATTIVITA,TIPO) values ('8',' SPIAGGIA ');
Insert into MARTINO.TIPO_ATTIVITA (ID_ATTIVITA,TIPO) values ('9',' CAMPEGGIO ');
REM INSERTING into MARTINO.UTENTE
SET DEFINE OFF;
Insert into MARTINO.UTENTE (ID_UTENTE,NOME,COGNOME,SESSO,USERNAME,PASSWORD,CITTA,UTENTE_IMMAGINE,INDIRIZZO,VERIFICATO,MAIL,NUMERO_TELEFONO,DATA_NASCITA) values ('156','prova','prova','maschio','prova','prova','prova','foto','prova','0','prova@gmail.com','1234567890',to_date('25-MAG-98','DD-MON-RR'));
Insert into MARTINO.UTENTE (ID_UTENTE,NOME,COGNOME,SESSO,USERNAME,PASSWORD,CITTA,UTENTE_IMMAGINE,INDIRIZZO,VERIFICATO,MAIL,NUMERO_TELEFONO,DATA_NASCITA) values ('1','ADMIN','CASA','M','ADMIN','ADMIN','CASA','n','VIA ROMA 15','1','MARIO.ROSSI@GMAIL.COM','3459898936',to_date('11-NOV-99','DD-MON-RR'));
Insert into MARTINO.UTENTE (ID_UTENTE,NOME,COGNOME,SESSO,USERNAME,PASSWORD,CITTA,UTENTE_IMMAGINE,INDIRIZZO,VERIFICATO,MAIL,NUMERO_TELEFONO,DATA_NASCITA) values ('3','MATTIA','BIANCHI','UOMO','MATTIA','MATTIAMATTIA','ROMA ','n','VIA MILANO 15','1','MATTIA.BIANCHI@GMAIL.COM','3459898938',to_date('11-NOV-99','DD-MON-RR'));
Insert into MARTINO.UTENTE (ID_UTENTE,NOME,COGNOME,SESSO,USERNAME,PASSWORD,CITTA,UTENTE_IMMAGINE,INDIRIZZO,VERIFICATO,MAIL,NUMERO_TELEFONO,DATA_NASCITA) values ('4','MARTINA','ROSSI','DONNA','MARTINA','MARTINAMARTINA','NAPOLI ','n','VIA MILANO 15','1','MARTINA.ROSSI@GMAIL.COM','3459898939',to_date('11-NOV-99','DD-MON-RR'));
Insert into MARTINO.UTENTE (ID_UTENTE,NOME,COGNOME,SESSO,USERNAME,PASSWORD,CITTA,UTENTE_IMMAGINE,INDIRIZZO,VERIFICATO,MAIL,NUMERO_TELEFONO,DATA_NASCITA) values ('5','LUCIA','MARTINO','DONNA','LUCIA','LUCIALUCIA','GENOVA ','n','VIA ROMA 15','0','11-NOV-99''LUCIA.MARTINO@GMAIL.COM','3459898931',to_date('11-NOV-99','DD-MON-RR'));
Insert into MARTINO.UTENTE (ID_UTENTE,NOME,COGNOME,SESSO,USERNAME,PASSWORD,CITTA,UTENTE_IMMAGINE,INDIRIZZO,VERIFICATO,MAIL,NUMERO_TELEFONO,DATA_NASCITA) values ('6','CLAUDIA','LAI','DONNA','CLAUDIA','CLAUDIACLAUDIA','CAGLIARI ','n','VIA GENOVA 15','0','CLAUDIA.LAI@GMAIL.COM','3459898925',to_date('11-NOV-99','DD-MON-RR'));
Insert into MARTINO.UTENTE (ID_UTENTE,NOME,COGNOME,SESSO,USERNAME,PASSWORD,CITTA,UTENTE_IMMAGINE,INDIRIZZO,VERIFICATO,MAIL,NUMERO_TELEFONO,DATA_NASCITA) values ('160','fasf','fsds',null,'ffa','a','a','foto','aaa','0','matteo98pili@gmail.com','2',to_date('25-MAG-98','DD-MON-RR'));
Insert into MARTINO.UTENTE (ID_UTENTE,NOME,COGNOME,SESSO,USERNAME,PASSWORD,CITTA,UTENTE_IMMAGINE,INDIRIZZO,VERIFICATO,MAIL,NUMERO_TELEFONO,DATA_NASCITA) values ('169','sdfghjk','sdfghjkl',null,'matteo',null,null,'foto',null,'0','prova3233@gmail.com',null,to_date('12-DIC-17','DD-MON-RR'));
Insert into MARTINO.UTENTE (ID_UTENTE,NOME,COGNOME,SESSO,USERNAME,PASSWORD,CITTA,UTENTE_IMMAGINE,INDIRIZZO,VERIFICATO,MAIL,NUMERO_TELEFONO,DATA_NASCITA) values ('186','Matteo','Pili','maschio','Matte',null,'Quartu','foto','via miioijnh','0','prova@prova.com','2345597',to_date('25-MAG-98','DD-MON-RR'));
Insert into MARTINO.UTENTE (ID_UTENTE,NOME,COGNOME,SESSO,USERNAME,PASSWORD,CITTA,UTENTE_IMMAGINE,INDIRIZZO,VERIFICATO,MAIL,NUMERO_TELEFONO,DATA_NASCITA) values ('2','giovanni','accenture','male','iop','iop','citta','foto','indirizzo','1','iop','telefono',to_date('12-DIC-89','DD-MON-RR'));
Insert into MARTINO.UTENTE (ID_UTENTE,NOME,COGNOME,SESSO,USERNAME,PASSWORD,CITTA,UTENTE_IMMAGINE,INDIRIZZO,VERIFICATO,MAIL,NUMERO_TELEFONO,DATA_NASCITA) values ('180','Roberto','Murgia','maschio','r.murgia17','test','Pirri','foto','Pirri','0','test@gmail.com','99667744',to_date('01-FEB-99','DD-MON-RR'));
Insert into MARTINO.UTENTE (ID_UTENTE,NOME,COGNOME,SESSO,USERNAME,PASSWORD,CITTA,UTENTE_IMMAGINE,INDIRIZZO,VERIFICATO,MAIL,NUMERO_TELEFONO,DATA_NASCITA) values ('165',null,null,null,null,'aaa',null,'foto',null,'0','liscinicola@live.it',null,null);
Insert into MARTINO.UTENTE (ID_UTENTE,NOME,COGNOME,SESSO,USERNAME,PASSWORD,CITTA,UTENTE_IMMAGINE,INDIRIZZO,VERIFICATO,MAIL,NUMERO_TELEFONO,DATA_NASCITA) values ('166','admin','admin','altro','admin','casa','casa','foto','casa','0','admin1@gmail.com','123456789',to_date('12-DIC-12','DD-MON-RR'));
REM INSERTING into MARTINO.UTENTE_RUOLO
SET DEFINE OFF;
--------------------------------------------------------
--  DDL for Index SYS_C008763
--------------------------------------------------------

  CREATE UNIQUE INDEX "MARTINO"."SYS_C008763" ON "MARTINO"."CANE" ("ID_CANE") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index SYS_C008756
--------------------------------------------------------

  CREATE UNIQUE INDEX "MARTINO"."SYS_C008756" ON "MARTINO"."DOG_FRIENDLY" ("ID_FRIENDLY") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index SYS_C008749
--------------------------------------------------------

  CREATE UNIQUE INDEX "MARTINO"."SYS_C008749" ON "MARTINO"."RAZZE" ("ID_RAZZA") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index SYS_C008729
--------------------------------------------------------

  CREATE UNIQUE INDEX "MARTINO"."SYS_C008729" ON "MARTINO"."RUOLO" ("ID_RUOLO") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index SYS_C008752
--------------------------------------------------------

  CREATE UNIQUE INDEX "MARTINO"."SYS_C008752" ON "MARTINO"."TIPO_ATTIVITA" ("ID_ATTIVITA") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index SYS_C008742
--------------------------------------------------------

  CREATE UNIQUE INDEX "MARTINO"."SYS_C008742" ON "MARTINO"."UTENTE" ("ID_UTENTE") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index SYS_C008743
--------------------------------------------------------

  CREATE UNIQUE INDEX "MARTINO"."SYS_C008743" ON "MARTINO"."UTENTE" ("MAIL") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index SYS_C008744
--------------------------------------------------------

  CREATE UNIQUE INDEX "MARTINO"."SYS_C008744" ON "MARTINO"."UTENTE_RUOLO" ("ID_UTENTE", "ID_RUOLO") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  Constraints for Table CANE
--------------------------------------------------------

  ALTER TABLE "MARTINO"."CANE" ADD PRIMARY KEY ("ID_CANE")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
  ALTER TABLE "MARTINO"."CANE" MODIFY ("PEDEGREE" NOT NULL ENABLE);
  ALTER TABLE "MARTINO"."CANE" MODIFY ("PELO" NOT NULL ENABLE);
  ALTER TABLE "MARTINO"."CANE" MODIFY ("SESSO" NOT NULL ENABLE);
  ALTER TABLE "MARTINO"."CANE" MODIFY ("TAGLIA" NOT NULL ENABLE);
  ALTER TABLE "MARTINO"."CANE" MODIFY ("ID_CANE" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table DOG_FRIENDLY
--------------------------------------------------------

  ALTER TABLE "MARTINO"."DOG_FRIENDLY" ADD PRIMARY KEY ("ID_FRIENDLY")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
  ALTER TABLE "MARTINO"."DOG_FRIENDLY" MODIFY ("INDIRIZZO" NOT NULL ENABLE);
  ALTER TABLE "MARTINO"."DOG_FRIENDLY" MODIFY ("NOMEATTIVITA" NOT NULL ENABLE);
  ALTER TABLE "MARTINO"."DOG_FRIENDLY" MODIFY ("ID_FRIENDLY" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table RAZZE
--------------------------------------------------------

  ALTER TABLE "MARTINO"."RAZZE" ADD PRIMARY KEY ("ID_RAZZA")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
  ALTER TABLE "MARTINO"."RAZZE" MODIFY ("RAZZA" NOT NULL ENABLE);
  ALTER TABLE "MARTINO"."RAZZE" MODIFY ("ID_RAZZA" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table RUOLO
--------------------------------------------------------

  ALTER TABLE "MARTINO"."RUOLO" ADD PRIMARY KEY ("ID_RUOLO")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
  ALTER TABLE "MARTINO"."RUOLO" MODIFY ("NOME" NOT NULL ENABLE);
  ALTER TABLE "MARTINO"."RUOLO" MODIFY ("ID_RUOLO" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table TIPO_ATTIVITA
--------------------------------------------------------

  ALTER TABLE "MARTINO"."TIPO_ATTIVITA" ADD PRIMARY KEY ("ID_ATTIVITA")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
  ALTER TABLE "MARTINO"."TIPO_ATTIVITA" MODIFY ("TIPO" NOT NULL ENABLE);
  ALTER TABLE "MARTINO"."TIPO_ATTIVITA" MODIFY ("ID_ATTIVITA" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table UTENTE
--------------------------------------------------------

  ALTER TABLE "MARTINO"."UTENTE" ADD UNIQUE ("MAIL")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
  ALTER TABLE "MARTINO"."UTENTE" ADD PRIMARY KEY ("ID_UTENTE")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
  ALTER TABLE "MARTINO"."UTENTE" MODIFY ("MAIL" NOT NULL ENABLE);
  ALTER TABLE "MARTINO"."UTENTE" MODIFY ("ID_UTENTE" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table UTENTE_RUOLO
--------------------------------------------------------

  ALTER TABLE "MARTINO"."UTENTE_RUOLO" ADD PRIMARY KEY ("ID_UTENTE", "ID_RUOLO")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
