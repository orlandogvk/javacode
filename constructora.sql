-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3306
-- Tiempo de generación: 27-11-2019 a las 08:56:37
-- Versión del servidor: 5.7.26
-- Versión de PHP: 7.2.18

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `constructora`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `departamento`
--

DROP TABLE IF EXISTS `departamento`;
CREATE TABLE IF NOT EXISTS `departamento` (
  `ID_DEPART` varchar(10) NOT NULL,
  `NOMBRE_DEPART` varchar(10) NOT NULL,
  `UBICACION_DEPAR` varchar(20) NOT NULL,
  PRIMARY KEY (`ID_DEPART`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleado`
--

DROP TABLE IF EXISTS `empleado`;
CREATE TABLE IF NOT EXISTS `empleado` (
  `ID_EMPLEADO` varchar(15) NOT NULL,
  `COD_EMPLEADO` varchar(60) NOT NULL,
  `CEDULA_EMPLEADO` varchar(60) NOT NULL,
  `NOMBRE_EMPLEADO` varchar(60) NOT NULL,
  `SALARIO_MENSUAL` int(12) NOT NULL,
  `RESPONSABLE_AREA` varchar(60) NOT NULL,
  PRIMARY KEY (`ID_EMPLEADO`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `nivel_riesgo`
--

DROP TABLE IF EXISTS `nivel_riesgo`;
CREATE TABLE IF NOT EXISTS `nivel_riesgo` (
  `ID_NIVEL_RIESGO` varchar(10) NOT NULL,
  `TIPO_RIESGO` varchar(15) NOT NULL,
  PRIMARY KEY (`ID_NIVEL_RIESGO`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `puesto`
--

DROP TABLE IF EXISTS `puesto`;
CREATE TABLE IF NOT EXISTS `puesto` (
  `ID_PUESTO` varchar(10) NOT NULL,
  `NOMBRE_PUESTO` varchar(15) NOT NULL,
  `ID_NIVEL_RIESGO` varchar(10) NOT NULL,
  `NIVEL_SALARIO_MIN` int(10) NOT NULL,
  `NIVEL_SALARIO_MAX` int(10) NOT NULL,
  PRIMARY KEY (`ID_PUESTO`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `registro_transaccion_ingreso`
--

DROP TABLE IF EXISTS `registro_transaccion_ingreso`;
CREATE TABLE IF NOT EXISTS `registro_transaccion_ingreso` (
  `ID_TRANS_ING` varchar(10) NOT NULL,
  `ID_EMPLEADO` varchar(15) NOT NULL,
  `ID_TIPO_ING` varchar(15) NOT NULL,
  `FECHA` date NOT NULL,
  `MONTO` int(10) NOT NULL,
  PRIMARY KEY (`ID_TRANS_ING`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `registro_transaccion_reduccion`
--

DROP TABLE IF EXISTS `registro_transaccion_reduccion`;
CREATE TABLE IF NOT EXISTS `registro_transaccion_reduccion` (
  `ID_TRANS_DED` varchar(10) NOT NULL,
  `ID_EMPLEADO` varchar(10) NOT NULL,
  `ID_TIPO_DEDl` varchar(10) NOT NULL,
  `FECHA` date NOT NULL,
  `MONTO` int(15) NOT NULL,
  PRIMARY KEY (`ID_TRANS_DED`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_deducccion`
--

DROP TABLE IF EXISTS `tipo_deducccion`;
CREATE TABLE IF NOT EXISTS `tipo_deducccion` (
  `ID_TIPO_DED` varchar(10) NOT NULL,
  `NOMBRE_DED` varchar(15) NOT NULL,
  PRIMARY KEY (`ID_TIPO_DED`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_ingreso`
--

DROP TABLE IF EXISTS `tipo_ingreso`;
CREATE TABLE IF NOT EXISTS `tipo_ingreso` (
  `ID_TIPO_ING` varchar(10) NOT NULL,
  `NOMBRE_TIPO_ING` varchar(20) NOT NULL,
  PRIMARY KEY (`ID_TIPO_ING`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

DROP TABLE IF EXISTS `usuario`;
CREATE TABLE IF NOT EXISTS `usuario` (
  `USUARIO` varchar(10) NOT NULL,
  `CLAVE` varchar(15) NOT NULL,
  PRIMARY KEY (`USUARIO`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
