-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 09-Maio-2022 às 22:08
-- Versão do servidor: 10.4.17-MariaDB
-- versão do PHP: 7.4.15

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `billykids`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `cliente`
--

CREATE TABLE `cliente` (
  `CPF` varchar(14) NOT NULL,
  `Nome` varchar(40) NOT NULL,
  `Telefone` varchar(14) NOT NULL,
  `Código` int(4) NOT NULL,
  `Nascimento` varchar(10) NOT NULL,
  `EstadoCivil` varchar(12) NOT NULL,
  `Logradouro` varchar(40) NOT NULL,
  `Bairro` varchar(20) NOT NULL,
  `CEP` varchar(9) NOT NULL,
  `Localidade` varchar(20) NOT NULL,
  `UF` varchar(2) NOT NULL,
  `Complemento` varchar(30) DEFAULT NULL,
  `NR` int(10) NOT NULL,
  `RG` int(7) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `cliente`
--

INSERT INTO `cliente` (`CPF`, `Nome`, `Telefone`, `Código`, `Nascimento`, `EstadoCivil`, `Logradouro`, `Bairro`, `CEP`, `Localidade`, `UF`, `Complemento`, `NR`, `RG`) VALUES
('324.030.490-34', 'JORGE', '(61)82729-3823', 1, '07/08/2003', 'CASADO', 'QNN 01', 'CEILONDRES', '87383-923', 'BRASILIA', 'DF', 'ONDE O COURO COME', 32, 32423432);

-- --------------------------------------------------------

--
-- Estrutura da tabela `contas`
--

CREATE TABLE `contas` (
  `Saldo` float NOT NULL,
  `Código` int(4) NOT NULL,
  `TipoConta` varchar(20) NOT NULL,
  `Agência` int(6) NOT NULL,
  `Movimentação` varchar(20) NOT NULL,
  `NúmeroConta` varchar(10) NOT NULL,
  `idCliente` int(12) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `contas`
--

INSERT INTO `contas` (`Saldo`, `Código`, `TipoConta`, `Agência`, `Movimentação`, `NúmeroConta`, `idCliente`) VALUES
(2343240000, 1, 'Poupança', 2313, '21111', '4332332-3', NULL),
(30, 2, 'Poupança', 3121, '30000', '32413442-3', 1);

-- --------------------------------------------------------

--
-- Estrutura da tabela `dependentes`
--

CREATE TABLE `dependentes` (
  `Telefone` varchar(14) NOT NULL,
  `CPF` varchar(14) NOT NULL,
  `RG` int(7) NOT NULL,
  `Nome` varchar(40) NOT NULL,
  `Nascimento` varchar(10) NOT NULL,
  `Código` int(4) NOT NULL,
  `idCliente` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `dependentes`
--

INSERT INTO `dependentes` (`Telefone`, `CPF`, `RG`, `Nome`, `Nascimento`, `Código`, `idCliente`) VALUES
('(61)82899-3333', '324.313.434-34', 433324, 'joao', '21/06/1100', 1, 1),
('(  )     -    ', '281.397.232-32', 35746832, 'Jose', '21/08/1979', 2, 1);

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`Código`),
  ADD UNIQUE KEY `CPF` (`CPF`),
  ADD UNIQUE KEY `RG` (`RG`);

--
-- Índices para tabela `contas`
--
ALTER TABLE `contas`
  ADD PRIMARY KEY (`Código`),
  ADD UNIQUE KEY `NúmeroConta` (`NúmeroConta`);

--
-- Índices para tabela `dependentes`
--
ALTER TABLE `dependentes`
  ADD PRIMARY KEY (`Código`),
  ADD UNIQUE KEY `CPF` (`CPF`),
  ADD UNIQUE KEY `RG` (`RG`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `cliente`
--
ALTER TABLE `cliente`
  MODIFY `Código` int(4) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de tabela `contas`
--
ALTER TABLE `contas`
  MODIFY `Código` int(4) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
