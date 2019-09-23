# Projeto1A_TecWeb

    create table register(
        id int(10) NOT NULL AUTO_INCREMENT,
        name varchar(100) NOT NULL,
        question varchar(200) NOT NULL,
        answer varchar(200),
        importance varchar(100) NOT NULL,
        PRIMARY KEY(id)
        )ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;


    create table usuarios(
      usuario varchar(50) NOT NULL,
      senha varchar(100) NOT NULL);
