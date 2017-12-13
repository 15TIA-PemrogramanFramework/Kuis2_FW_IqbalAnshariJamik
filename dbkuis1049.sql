-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: 13 Des 2017 pada 16.53
-- Versi Server: 5.7.15-log
-- PHP Version: 5.6.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dbkuis1049`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `identitas_1049`
--

CREATE TABLE `identitas_1049` (
  `id` bigint(20) NOT NULL,
  `nim` varchar(100) NOT NULL,
  `nama` varchar(100) NOT NULL,
  `prodi` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data untuk tabel `identitas_1049`
--

INSERT INTO `identitas_1049` (`id`, `nim`, `nama`, `prodi`) VALUES
(1, '1040', 'Iqbal', 'Tenik Informatika');

-- --------------------------------------------------------

--
-- Struktur dari tabel `ipk_1049`
--

CREATE TABLE `ipk_1049` (
  `id` bigint(20) NOT NULL,
  `alamat` varchar(100) NOT NULL,
  `asal` varchar(100) NOT NULL,
  `ipk` double NOT NULL,
  `identitas_1049_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data untuk tabel `ipk_1049`
--

INSERT INTO `ipk_1049` (`id`, `alamat`, `asal`, `ipk`, `identitas_1049_id`) VALUES
(1, 'rumbai', 'pekanbaru', 3, 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `identitas_1049`
--
ALTER TABLE `identitas_1049`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `UK_hyi9735wawtv7g6i1nkua9xor` (`nim`),
  ADD UNIQUE KEY `UK_okoafunjwl62a7826xpltcgqp` (`nama`),
  ADD UNIQUE KEY `UK_q1u8ss8r6bxdeb5y3cw4lw6pm` (`prodi`);

--
-- Indexes for table `ipk_1049`
--
ALTER TABLE `ipk_1049`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `UK_2ornj1pxik97yu2hjolgwdvlm` (`alamat`),
  ADD UNIQUE KEY `UK_ghbwv1u3dm98dn2rb4mpbvfye` (`asal`),
  ADD KEY `FKlqx0wmkhk7o9u54m4bpnmho40` (`identitas_1049_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `identitas_1049`
--
ALTER TABLE `identitas_1049`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
--
-- AUTO_INCREMENT for table `ipk_1049`
--
ALTER TABLE `ipk_1049`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `ipk_1049`
--
ALTER TABLE `ipk_1049`
  ADD CONSTRAINT `FKlqx0wmkhk7o9u54m4bpnmho40` FOREIGN KEY (`identitas_1049_id`) REFERENCES `identitas_1049` (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
