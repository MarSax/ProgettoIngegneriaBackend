CREATE TABLE IF NOT EXISTS Musei.Museo(
	Id INT NOT NULL AUTO_INCREMENT,
	Nome VARCHAR(30) NOT NULL,
	Indirizzo VARCHAR(60) NOT NULL,
	Citta VARCHAR(30) NOT NULL,
	PRIMARY KEY(id)
);

CREATE TABLE IF NOT EXISTS Musei.Opera(
	Id INT NOT NULL AUTO_INCREMENT,
	Nome VARCHAR(30) NOT NULL,
	Id_autore INT NOT NULL,
	Id_museo INT NOT NULL,
	Descrizione_breve VARCHAR(100),
	Descrizione_lunga VARCHAR(300),
	PRIMARY KEY(Id)
);

CREATE TABLE IF NOT EXISTS Musei.Utente(
	Id INT NOT NULL AUTO_INCREMENT,
	Nome VARCHAR(30) NOT NULL,
	Cognome VARCHAR(30) NOT NULL,
	Data_di_nascita VARCHAR(15) NOT NULL,
	Luogo_di_nascita VARCHAR(30) NOT NULL,
	Tipo VARCHAR(30) NOT NULL,
	Email VARCHAR(70) NOT NULL,
	Username VARCHAR(70) NOT NULL,
	Password VARCHAR(40) NOT NULL,
	Id_museo INT,
	PRIMARY KEY(Id)
);

CREATE TABLE IF NOT EXISTS Musei.Autore(
	Id INT NOT NULL AUTO_INCREMENT,
	Nome VARCHAR(30) NOT NULL,
	Cognome VARCHAR(30) NOT NULL,
	Data_di_nascita VARCHAR(15) NOT NULL,
	Luogo_di_nascita VARCHAR(30) NOT NULL,
	PRIMARY KEY(Id)
);

ALTER TABLE Opera ADD FOREIGN KEY (Id_autore) REFERENCES Autore(Id);
ALTER TABLE Opera ADD FOREIGN KEY (Id_museo) REFERENCES Museo(Id);
ALTER TABLE Utente ADD FOREIGN KEY (Id_museo) REFERENCES Museo(Id);