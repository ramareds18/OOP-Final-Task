-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 24, 2019 at 06:44 AM
-- Server version: 10.1.37-MariaDB
-- PHP Version: 7.3.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_murottal`
--

-- --------------------------------------------------------

--
-- Table structure for table `tb_madaniyyah`
--

CREATE TABLE `tb_madaniyyah` (
  `id_md` varchar(6) NOT NULL,
  `nama_surat` varchar(30) NOT NULL,
  `arti_nama_surat` varchar(200) NOT NULL,
  `jumlah_ayat` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tb_madaniyyah`
--

INSERT INTO `tb_madaniyyah` (`id_md`, `nama_surat`, `arti_nama_surat`, `jumlah_ayat`) VALUES
('MD01', 'Al-Baqarah', 'Sapi Betina', 286),
('MD02', 'Ali Imran', 'Keluarga Imran', 200),
('MD03', 'An-Nisa', 'Wanita', 176),
('MD04', 'Al-Maidah', 'Jamuan (Hidangan Makanan)', 120),
('MD05', 'Al-Anfal', 'Harta Rampasan Perang', 75),
('MD06', 'At-Taubah', 'Pengampunan', 129),
('MD07', 'Al-Hajj', 'Haji', 78),
('MD08', 'An-Nur', 'Cahaya', 64),
('MD09', 'Al-Ahzab', 'Golongan-Golongan Yang Bersekutu', 73),
('MD10', 'Muhammad', 'Muhammad', 38),
('MD11', 'Al-Fath', 'Kemenangan', 29),
('MD12', 'Al-Hujurat', 'Kamar-Kamar', 18),
('MD13', 'Ar-Rahman', 'Yang Maha Pemurah', 78),
('MD14', 'Al-Hadid', 'Besi', 29),
('MD15', 'Al-Mujadilah', 'Wanita Yang Mengajukan Gugatan', 22),
('MD16', 'Al-Hasyr', 'Pengusiran', 24),
('MD17', 'Al-Mumtahanah', 'Wanita Yang Diuji', 13),
('MD18', 'As-Saff', 'Satu Barisan', 14),
('MD19', 'Al-Jumu’ah', 'Hari Jumat', 11),
('MD20', 'Al-Munafiqun', 'Orang-Orang Yang Munafik', 11),
('MD21', 'At-Tagabun', 'Hari Dinampakkan Kesalahan-Kesalahan', 18),
('MD22', 'At-Talaq', 'Talak', 12),
('MD23', 'At-Tahrim', 'Mengharamkan', 12),
('MD24', 'Al-Bayyinah', 'Pembuktian', 8),
('MD25', 'Az-Zalzalah', 'Kegoncangan', 8),
('MD26', 'An-Nasr', 'Pertolongan', 3);

-- --------------------------------------------------------

--
-- Table structure for table `tb_makiyyah`
--

CREATE TABLE `tb_makiyyah` (
  `id_mk` varchar(6) NOT NULL,
  `nama_surat` varchar(30) NOT NULL,
  `arti_nama_surat` varchar(200) NOT NULL,
  `jumlah_ayat` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tb_makiyyah`
--

INSERT INTO `tb_makiyyah` (`id_mk`, `nama_surat`, `arti_nama_surat`, `jumlah_ayat`) VALUES
('MK01', 'Al-Fatihah', 'Pembukaan', 7),
('MK02', 'Al-An’am', 'Binatang Ternak', 165),
('MK03', 'Al-A’raf', 'Tempat Yang Tertinggi', 206),
('MK04', 'Yunus', 'Yunus', 109),
('MK05', 'Hud', 'Hud', 123),
('MK06', 'Yusuf', 'Yusuf', 111),
('MK07', 'Ar-Ra\'d', 'Guruh (Petir)', 43),
('MK08', 'Ibrahim', 'Ibrahim', 52),
('MK09', 'Al-Hijr', 'Al Hijr (Nama Gunung)', 99),
('MK10', 'An-Nahl', 'Lebah', 128),
('MK11', 'Al-Isra’', 'Memperjalankan Di Waktu Malam', 111),
('MK12', 'Al-Kahf', 'Penghuni-Penghuni Gua', 110),
('MK13', 'Maryam', 'Maryam (Maria)', 98),
('MK14', 'Ta Ha', 'Ta Ha', 135),
('MK15', 'Al-Anbiya', 'Nabi-Nabi', 112),
('MK16', 'Al-Mu’minun', '', 118),
('MK17', 'Al-Furqan', 'Orang-Orang Mukmin', 77),
('MK18', 'Asy-Syu’ara’', 'Penyair', 227);

-- --------------------------------------------------------

--
-- Table structure for table `tb_surat`
--

CREATE TABLE `tb_surat` (
  `id_surat` varchar(6) NOT NULL,
  `nama_surat` varchar(30) NOT NULL,
  `arti_nama_surat` varchar(100) DEFAULT NULL,
  `jumlah_ayat` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tb_surat`
--

INSERT INTO `tb_surat` (`id_surat`, `nama_surat`, `arti_nama_surat`, `jumlah_ayat`) VALUES
('S001', 'Al-Fatihah', 'Pembukaan', 7),
('S002', 'Al-Baqarah', 'Sapi Betina', 286),
('S003', 'Ali Imran', 'Keluarga Imran', 200),
('S004', 'An-Nisa', 'Wanita', 176),
('S005', 'Al-Maidah', 'Jamuan (Hidangan Makan)', 120),
('S006', 'Al-An’am', 'Binatang Ternak', 165),
('S007', 'Al-A’raf', 'Tempat Yang Tertinggi', 206),
('S008', 'Al-Anfal', 'Harta Rampasan Perang', 75),
('S009', 'At-Taubah', 'Pengampunan', 129),
('S010', 'Yunus', 'Nabi Yunus', 109),
('S011', 'Hud', 'Nabi Hud', 123),
('S012', 'Yusuf', 'Nabi Yusuf', 111),
('S013', 'Ar-Ra\'d', 'Guruh (Petir)', 43),
('S014', 'Ibrahim', 'Nabi Ibrahim', 52),
('S015', 'Al-Hijr', 'Al Hijr (Nama Gunung)', 99),
('S016', 'An-Nahl', 'Lebah', 128),
('S017', 'Al-Isra’', 'Memperjalankan Di Waktu Malam', 111),
('S018', 'Al-Kahf', 'Penghuni-Penghuni Gua', 110),
('S019', 'Maryam', 'Maryam (Maria)', 98),
('S020', 'Ta Ha', 'Ta Ha', 135),
('S021', 'Al-Anbiya', 'Nabi-Nabi', 112),
('S022', 'Al-Hajj', 'Haji', 78),
('S023', 'Al-Mu’minun', 'Orang-Orang Mukmin', 118),
('S024', 'An-Nur', 'Cahaya', 64),
('S025', 'Al-Furqan', 'Pembeda', 77),
('S026', 'Asy-Syu’ara’', 'Penyair', 227),
('S027', 'An-Naml', 'Semut', 93),
('S028', 'Al-Qasas', 'Cerita', 88),
('S029', 'Al-‘Ankabut', 'Laba-Laba', 69),
('S030', 'Ar-Rum', 'Bangsa Romawi', 60),
('S031', 'Luqman', 'Keluarga Luqman', 34),
('S032', 'As-Sajdah', 'Sajdah', 30),
('S033', 'Al-Ahzab', 'Golongan-Golongan Yang Bersekutu', 73),
('S034', 'Saba’', 'Kaum Saba’', 54),
('S035', 'Fatir', 'Pencipta', 45),
('S036', 'Yaasin', 'Yaasiin', 83),
('S037', 'As-Saffat', 'Barisan-Barisan', 182),
('S038', 'Sad', 'Shaad', 88),
('S039', 'Az-Zumar', 'Rombongan-Rombongan', 75),
('S040', 'Mu’min', 'Orang Yg Beriman', 85),
('S041', 'Fussilat', 'Yang Dijelaskan', 54),
('S042', 'Asy-Syura', 'Musyawarah', 53),
('S043', 'Az-Zukhruf', 'Perhiasan', 89),
('S044', 'Ad-Dukhan', 'Kabut', 59),
('S045', 'Al-Jasiyah', 'Yang Bertekuk Lutut', 37),
('S046', 'Al-Ahqaf', 'Bukit-Bukit Pasir', 35),
('S047', 'Muhammad', 'Muhammad', 38),
('S048', 'Al-Fath', 'Kemenangan', 29),
('S049', 'Al-Hujurat', 'Kamar-Kamar', 18),
('S050', 'Qaf', 'Qaaf', 45),
('S051', 'Az-Zariyat', 'Angin Yang Menerbangkan', 60),
('S052', 'At-Tur', 'Bukit', 49),
('S053', 'An-Najm', 'Bintang', 62),
('S054', 'Al-Qamar', 'Bulan', 55),
('S055', 'Ar-Rahman', 'Yang Maha Pemurah', 78),
('S056', 'Al-Waqi’ah', 'Hari Kiamat', 96),
('S057', 'Al-Hadid', 'Besi', 29),
('S058', 'Al-Mujadilah', 'Wanita Yang Mengajukan Gugatan', 22),
('S059', 'Al-Hasyr', 'Pengusiran', 24),
('S060', 'Al-Mumtahanah', 'Wanita Yang Diuji', 13),
('S061', 'As-Saff', 'Satu Barisan', 14),
('S062', 'Al-Jumu’ah', 'Hari Jum’at', 11),
('S063', 'Al-Munafiqun', 'Orang-Orang Yang Munafik', 11),
('S064', 'At-Tagabun', 'Hari Dinampakkan Kesalahan-Kesalahan', 18),
('S065', 'At-Talaq', 'Talak', 12),
('S066', 'At-Tahrim', 'Mengharamkan', 12),
('S067', 'Al-Mulk', 'Kerajaan', 30),
('S068', 'Al-Qalam', 'Pena', 52),
('S069', 'Al-Haqqah', 'Hari Kiamat', 52),
('S070', 'Al-Ma’arij', 'Tempat Naik', 44),
('S071', 'Nuh', 'Nuh', 28),
('S072', 'Al-Jinn', 'Jin', 28),
('S073', 'Al-Muzzammil', 'Orang Yang Berselimut', 20),
('S074', 'Al-Muddassir', 'Orang Yang Berkemul', 56),
('S075', 'Al-Qiyamah', 'Hari Kiamat', 40),
('S076', 'Al-Insan', 'Manusia', 31),
('S077', 'Al-Mursalat', 'Malaikat-Malaikat Yang Diutus', 50),
('S078', 'An-Naba’', 'Berita Besar', 40),
('S079', 'An-Nazi’at', 'Malaikat-Malaikat Yang Mencabut', 46),
('S080', '‘Abasa', 'Ia Bermuka Masam', 42),
('S081', 'At-Takwir', 'Menggulung', 29),
('S082', 'Al-Infitar', 'Terbelah', 19),
('S083', 'Al-Tatfif', 'Orang-Orang Yang Curang', 36),
('S084', 'Al-Insyiqaq', 'Terbelah', 25),
('S085', 'Al-Buruj', 'Gugusan Bintang', 22),
('S086', 'At-Tariq', 'Yang Datang Di Malam Hari', 17),
('S087', 'Al-A’la', 'Yang Paling Tinggi', 19),
('S088', 'Al-Gasyiyah', 'Hari Pembalasan', 26),
('S089', 'Surah Al-Fajr', 'Fajar', 30),
('S090', 'Al-Balad', 'Negeri', 20),
('S091', 'Asy-Syams', 'Matahari', 15),
('S092', 'Al-Lail', 'Malam', 21),
('S093', 'Ad-Duha', 'Waktu Matahari Sepenggalahan Naik (Dhuha)', 11),
('S094', 'Al-Insyirah', 'Melapangkan', 8),
('S095', 'At-Tin', 'Buah Tin', 8),
('S096', 'Al-‘Alaq', 'Segumpal Darah', 19),
('S097', 'Al-Qadr', 'Kemuliaan', 5),
('S098', 'Al-Bayyinah', 'Pembuktian', 8),
('S099', 'Az-Zalzalah', 'Kegoncangan', 8),
('S100', 'Al-‘Adiyat', 'Berlari Kencang', 11),
('S101', 'Al-Qari’ah', 'Hari Kiamat', 11),
('S102', 'At-Takasur', 'Bermegah-Megahan', 8),
('S103', 'Al-‘Asr', 'Masa/Waktu', 3),
('S104', 'Al-Humazah', 'Pengumpat', 9),
('S105', 'Al-Fil', 'Gajah', 5),
('S106', 'Quraisy', 'Suku Quraisy', 4),
('S107', 'Al-Ma’un', 'Barang-Barang Yang Berguna', 7),
('S108', 'Al-Kausar', 'Nikmat Yang Berlimpah', 3),
('S109', 'Al-Kafirun', 'Orang-Orang Kafir', 6),
('S110', 'An-Nasr', 'Pertolongan', 3),
('S111', 'Al-Lahab', 'Gejolak Api/Sabut', 5),
('S112', 'Al-Ikhlas', 'Ikhlas', 4),
('S113', 'Al-Falaq', 'Waktu Subuh', 5),
('S114', 'An-Nas', 'Manusia', 6);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tb_madaniyyah`
--
ALTER TABLE `tb_madaniyyah`
  ADD PRIMARY KEY (`id_md`);

--
-- Indexes for table `tb_makiyyah`
--
ALTER TABLE `tb_makiyyah`
  ADD PRIMARY KEY (`id_mk`);

--
-- Indexes for table `tb_surat`
--
ALTER TABLE `tb_surat`
  ADD PRIMARY KEY (`id_surat`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
