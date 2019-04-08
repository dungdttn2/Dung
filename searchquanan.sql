-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 01, 2019 at 05:16 AM
-- Server version: 10.1.38-MariaDB
-- PHP Version: 7.3.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `searchquanan`
--

-- --------------------------------------------------------

--
-- Table structure for table `loai`
--

CREATE TABLE `loai` (
  `id` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `ten` varchar(100) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `loai`
--

INSERT INTO `loai` (`id`, `ten`) VALUES
('125', 'Cửa hàng cafe'),
('196', 'Buffet'),
('197', 'Nhà hàng'),
('198', 'Ăn vặt, vỉa hè'),
('199', 'Quán nhậu'),
('963', 'Ăn lẩu, nướng'),
('968', 'Cửa hàng ăn nhanh');

-- --------------------------------------------------------

--
-- Table structure for table `monan`
--

CREATE TABLE `monan` (
  `id` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `ten` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `quan` varchar(100) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `monan`
--

INSERT INTO `monan` (`id`, `ten`, `quan`) VALUES
('11', 'bạc xỉu', '1'),
('110', 'bạc xỉu', '10'),
('111', 'bạc xỉu', '11'),
('112', 'bạc xỉu', '12'),
('113', 'bạc xỉu', '13'),
('115', 'bạc xỉu', '15'),
('12', 'bạc xỉu', '2'),
('13', 'bạc xỉu', '3'),
('14', 'bạc xỉu', '4'),
('15', 'bạc xỉu', '5'),
('16', 'bạc xỉu', '6'),
('17', 'bạc xỉu', '7'),
('18', 'bạc xỉu', '8'),
('19', 'bạc xỉu', '9'),
('21', 'cafe đen/nâu hà nội', '1'),
('210', 'cafe đen/nâu hà nội', '9'),
('211', 'cafe đen/nâu hà nội', '11'),
('212', 'cafe đen/nâu hà nội', '12'),
('213', 'cafe đen/nâu hà nội', '13'),
('214', 'cafe đen/nâu hà nội', '14'),
('215', 'cafe đen/nâu hà nội', '15'),
('22', 'cafe đen/nâu hà nội', '2'),
('23', 'cafe đen/nâu hà nội', '3'),
('24', 'cafe đen/nâu hà nội', '4'),
('25', 'cafe đen/nâu hà nội', '5'),
('26', 'cafe đen/nâu hà nội', '6'),
('27', 'cafe đen/nâu hà nội', '7'),
('28', 'cafe đen/nâu hà nội', '8'),
('29', 'cafe đen/nâu hà nội', '9'),
('31', 'Cafe sữa tươi', '1'),
('310', 'Cafe sữa tươi', '10'),
('311', 'Cafe sữa tươi', '11'),
('312', 'Cafe sữa tươi', '12'),
('313', 'Cafe sữa tươi', '13'),
('314', 'Cafe sữa tươi', '14'),
('315', 'Cafe sữa tươi', '15'),
('32', 'Cafe sữa tươi', '2'),
('33', 'Cafe sữa tươi', '3'),
('34', 'Cafe sữa tươi', '4'),
('35', 'Cafe sữa tươi', '5'),
('36', 'Cafe sữa tươi', '6'),
('37', 'Cafe sữa tươi', '7'),
('38', 'Cafe sữa tươi', '8'),
('39', 'Cafe sữa tươi', '9'),
('41', 'Cà Phê  Hokkaido', '1'),
('410', 'Cà Phê  Hokkaido', '10'),
('411', 'Cà Phê  Hokkaido', '11'),
('412', 'Cà Phê  Hokkaido', '12'),
('413', 'Cà Phê  Hokkaido', '13'),
('414', 'Cà Phê  Hokkaido', '14'),
('415', 'Cà Phê  Hokkaido', '15'),
('42', 'Cà Phê  Hokkaido', '2'),
('43', 'Cà Phê  Hokkaido', '3'),
('44', 'Cà Phê  Hokkaido', '4'),
('45', 'Cà Phê  Hokkaido', '5'),
('452', 'Mì tôm trứng', '562'),
('46', 'Cà Phê  Hokkaido', '6'),
('47', 'Cà Phê  Hokkaido', '7'),
('48', 'Cà Phê  Hokkaido', '8'),
('49', 'Cà Phê  Hokkaido', '9'),
('51', 'Cà Phê  Mocha\r\nCà Phê  Hạt Dẻ\r\nCà Phê  Vani\r\nCà Phê Đặc Biệt\r\nCà Phê  Hokkaido', '1'),
('510', 'Cà Phê  Mocha\r\nCà Phê  Hạt Dẻ\r\nCà Phê  Vani\r\nCà Phê Đặc Biệt\r\nCà Phê  Hokkaido', '10'),
('511', 'Cà Phê  Mocha\r\nCà Phê  Hạt Dẻ\r\nCà Phê  Vani\r\nCà Phê Đặc Biệt\r\nCà Phê  Hokkaido', '11'),
('512', 'Cà Phê  Mocha\r\nCà Phê  Hạt Dẻ\r\nCà Phê  Vani\r\nCà Phê Đặc Biệt\r\nCà Phê  Hokkaido', '12'),
('5123', 'Hamburger', '562'),
('513', 'Cà Phê  Mocha\r\nCà Phê  Hạt Dẻ\r\nCà Phê  Vani\r\nCà Phê Đặc Biệt\r\nCà Phê  Hokkaido', '13'),
('52', 'Cà Phê  Mocha\r\nCà Phê  Hạt Dẻ\r\nCà Phê  Vani\r\nCà Phê Đặc Biệt\r\nCà Phê  Hokkaido', '2'),
('53', 'Cà Phê  Mocha\r\nCà Phê  Hạt Dẻ\r\nCà Phê  Vani\r\nCà Phê Đặc Biệt\r\nCà Phê  Hokkaido', '3'),
('54', 'Cà Phê  Mocha\r\nCà Phê  Hạt Dẻ\r\nCà Phê  Vani\r\nCà Phê Đặc Biệt\r\nCà Phê  Hokkaido', '4'),
('55', 'Cà Phê  Mocha\r\nCà Phê  Hạt Dẻ\r\nCà Phê  Vani\r\nCà Phê Đặc Biệt\r\nCà Phê  Hokkaido', '5'),
('56', 'Cà Phê  Mocha\r\nCà Phê  Hạt Dẻ\r\nCà Phê  Vani\r\nCà Phê Đặc Biệt\r\nCà Phê  Hokkaido', '6'),
('57', 'Cà Phê  Mocha\r\nCà Phê  Hạt Dẻ\r\nCà Phê  Vani\r\nCà Phê Đặc Biệt\r\nCà Phê  Hokkaido', '7'),
('58', 'Cà Phê  Mocha\r\nCà Phê  Hạt Dẻ\r\nCà Phê  Vani\r\nCà Phê Đặc Biệt\r\nCà Phê  Hokkaido', '8'),
('59', 'Cà Phê  Mocha\r\nCà Phê  Hạt Dẻ\r\nCà Phê  Vani\r\nCà Phê Đặc Biệt\r\nCà Phê  Hokkaido', '9'),
('61', 'Trà Đen Vị Bưởi\r\nTrà Đen Vị Mận\r\nTrà Đen Vị Ô Mai\r\nTrà Đen Vị Đào\r\nTrà Đen Vị Chanh Leo\r\nTrà Đen Vị ', '1'),
('610', 'Trà Đen Vị Bưởi\r\nTrà Đen Vị Mận\r\nTrà Đen Vị Ô Mai', '10'),
('611', 'Trà Đen Vị Bưởi\r\nTrà Đen Vị Mận\r\nTrà Đen Vị Ô Mai', '11'),
('62', 'Trà Đen Vị Bưởi\r\nTrà Đen Vị Mận\r\nTrà Đen Vị Ô Mai', '2'),
('63', 'Trà Đen Vị Bưởi\r\nTrà Đen Vị Mận\r\nTrà Đen Vị Ô Mai', '3'),
('64', 'Trà Đen Vị Bưởi\r\nTrà Đen Vị Mận\r\nTrà Đen Vị Ô Mai', '4'),
('65', 'Trà Đen Vị Bưởi\r\nTrà Đen Vị Mận\r\nTrà Đen Vị Ô Mai', '5'),
('66', 'Trà Đen Vị Bưởi\r\nTrà Đen Vị Mận\r\nTrà Đen Vị Ô Mai', '6'),
('67', 'Trà Đen Vị Bưởi\r\nTrà Đen Vị Mận\r\nTrà Đen Vị Ô Mai', '7'),
('68', 'Trà Đen Vị Bưởi\r\nTrà Đen Vị Mận\r\nTrà Đen Vị Ô Mai', '8'),
('69', 'Trà Đen Vị Bưởi\r\nTrà Đen Vị Mận\r\nTrà Đen Vị Ô Mai', '9'),
('74', 'Hồng Trà Sữa\r\nTrà Sữa Vị Hoa Nhài\r\nTrà Xanh Sữa\r\nTrà Sữa Ô Long\r\nTrà Sữa Khoai Môn\r\nTrà Sữa Mật Ong\r', '4'),
('84', 'Trà Sữa Thạch Pudding\r\nTrà Sữa Lô Hội\r\nTrà Sữa Hokkaido\r\nTrà Sữa Đường Đen\r\nTrà Sữa Hạt Dẻ\r\nTrà Sữa ', '4');

-- --------------------------------------------------------

--
-- Table structure for table `quanan`
--

CREATE TABLE `quanan` (
  `id` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `ten` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `sdt` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `diachi` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `loai` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `lat` double NOT NULL,
  `lng` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `quanan`
--

INSERT INTO `quanan` (`id`, `ten`, `sdt`, `diachi`, `loai`, `lat`, `lng`) VALUES
('01', 'Nhà hàng 268', '+84 97 535 22 28', 'Đường Z 115, Quyết Thắng, Thành phố Thái Nguyên, Thái Nguyên, Việt Nam', '197', 21.5869, 105.804375),
('010', 'Nhà hàng Biển Xanh', '+84 208 6292 532', 'Đường Lương Ngọc Quyến,, Thái Nguyên, Hàng Văn Thụ0, Thành phố Thái Nguyên, Thái Nguyên, Việt Nam', '197', 21.59031, 105.827163),
('011', 'Nhà Hàng Thái Việt Palace ', '+84 93 157 46 66', 'SN99, Phố, Nguyễn Công Hoan, Đồng Quang, Thành phố Thái Nguyên, Thái Nguyên, Việt Nam', '197', 21.580929, 105.832968),
('012', 'Nhà Hàng Quý Suốt', '+84 208 3854 105', '299 Thống Nhất, Gia Sàng, Thành phố Thái Nguyên, Thái Nguyên, Việt Nam', '197', 21.578139, 105.835978),
('013', 'Nhà Hàng Thái', '+84 94 622 21 88', 'Phan Đình Phùng, Đồng Quang, Tp. Thái Nguyên, Thái Nguyên, Việt Nam', '197', 21.580653, 105.835925),
('014', 'Nhà Hàng Đèn Lồng Đỏ', '+84 96 287 88 88', 'Khu Tư San Nền, Tổ 11, Phường Đồng Quang, Đồng Quang, Thái Nguyên, Việt Nam', '197', 21.581865, 105.834914),
('015', 'Nhà hàng Tín Nhiệm Big Restaurant', '+84 98 888 01 88', 'Phan Đình Phùng, Thành phố Thái Nguyên, Thái Nguyên, Việt Nam', '197', 21.584055, 105.837911),
('016', 'Nhà Hàng Gimbab Hàn Quốc', '+84 208 6255 588', '178 Đường Minh Cầu, Phan Đình Phùng, Thành phố Thái Nguyên, Thái Nguyên, Việt Nam', '197', 21.587486, 105.839292),
('017', 'Nhà hàng 158', '+84 868 851 158', '158 Đường Minh Cầu, Phan Đình Phùng, Thành phố Thái Nguyên, Thái Nguyên, Việt Nam', '197', 21.588156, 105.838047),
('018', 'Nhà Hàng Bình Tàu', '+84 98 300 77 69', 'Tổ 5, Phường Phan Đình Phùng, Tp Thái Nguyên, Phan Đình Phùng, Thành phố Thái Nguyên, Thái Nguyên, V', '197', 21.590311, 105.837246),
('019', 'Nhà hàng Dancer', '+84 208 3754 988', 'Phan Đình Phùng, Thành phố Thái Nguyên, Thái Nguyên, Việt Nam', '197', 21.591774, 105.839491),
('02', 'Gà Tươi Anh Vũ', '+84 98 583 80 99', '271, Đường Z 115, Tân Thịnh, Thành phố Thái Nguyên, Thái Nguyên, Việt Nam', '197', 21.583996, 105.810952),
('020', 'Nhà hàng Cây Xanh', 'Ngõ 22- PL, Hàng Văn Thụ0, Thành phố Thái Nguyên, Thái Nguyên, Việt Nam', '', '197', 21.596016, 105.83392),
('021', 'Nhà Hàng Hằng Béo', '+84 97 920 07 77', 'Thịnh Đán, Thành phố Thái Nguyên, Thái Nguyên, Việt Nam', '197', 21.569959, 105.807587),
('022', 'Nhà Hàng Thanh Hương', '+84 97 751 32 68', '354, Quang Trung, Phường Thịnh Đán, Thành Phố Thái Nguyên, Tỉnh Thái Nguyên, Thịnh Đán, Thành phố Th', '197', 21.571956, 105.811926),
('023', 'Nhà Hàng Thảo Dương', '+84 97 802 36 66', '24 Ngõ tổ 19 Quang Trung, Thịnh Đán, Thành phố Thái Nguyên, Thái Nguyên, Việt Nam', '197', 21.57424, 105.810031),
('024', 'Nhà Hàng Hoàng Lực', '+84 97 251 30 22', 'Thịnh Đán, Thành phố Thái Nguyên, Thái Nguyên, Việt Nam', '197', 21.574678, 105.813459),
('025', 'Vua Gà Tươi Hoàng Gia', '+84 96 799 96 26', 'Hoàng Gia, Tân Thịnh, Thành phố Thái Nguyên, Thái Nguyên, Việt Nam', '197', 21.575888, 105.818245),
('027', 'Nhà hàng Thuận Yến 2', '', '153 Quang Trung, Đồng Quang, Thành phố Thái Nguyên, Thái Nguyên, Việt Nam', '197', 21.584025, 105.821288),
('028', 'Quán Cay Đức Huệ 1', '+84 98 302 46 59', 'Bắc Cạn, Hàng Văn Thụ0, Thành phố Thái Nguyên, Thái Nguyên, Việt Nam', '197', 21.600468, 105.831755),
('029', 'Nhà Hàng Dũng Minh', '+84 97 425 28 51', 'QL3, Sơn Cẩm, Phú Lương, Thái Nguyên, Việt Nam', '197', 21.623417, 105.79027),
('03', 'Aloha BBQ&Hotpot Thái Nguyên', '+84 208 6558 866', 'Tân Thịnh, Thành phố Thái Nguyên, Thái Nguyên, Việt Nam', '197', 21.584169, 105.811485),
('030', 'Quán cay Đức Huệ 2', '+84 96 692 22 88', '166, Dương Tự Minh, Phường Quang Trung, Hàng Văn Thụ0, Thành phố Thái Nguyên, Thái Nguyên, Việt Nam', '197', 21.602865, 105.820751),
('031', 'Nhà hàng Lẩu Thái Thái Nguyên', '+84 98 861 11 66', '474 Phan Đình Phùng, Đồng Quang, Thành phố Thái Nguyên, Thái Nguyên, Việt Nam', '197', 21.580978, 105.836221),
('032', 'Nhà Hàng Hoàng Mấm', '+84 208 3841 999', 'Lương Thế Vinh, Thành Phố Thái Nguyên, Tỉnh Thái Nguyên, Hàng Văn Thụ0, Thành phố Thái Nguyên, Thái ', '197', 21.594826, 105.827746),
('033', 'B52 restaurant hoàng gia', '', 'Hoàng Gia, Tân Thịnh, Thành phố Thái Nguyên, Thái Nguyên, Việt Nam', '197', 21.580142, 105.816792),
('034', 'Nhà Hàng Cây Xanh - Tiệc Cưới Hội Nghị - Cưới Hỏi Trọn Gói', '+84 94 869 98 12', 'Thịnh Đức, Thành phố Thái Nguyên, Thái Nguyên, Việt Nam', '197', 21.561465, 105.790369),
('035', 'Nhà Hàng Bạch Dương', '+84 98 238 45 75', '219, Quang Trung, Phường Thịnh Đán, Thành Phố Thái Nguyên, Tỉnh Thái Nguyên, Thịnh Đán, Thành phố Th', '197', 21.562835, 105.807426),
('036', 'Nhà Hàng Ven Hồ', '', 'Tân Thịnh, Thành phố Thái Nguyên, Thái Nguyên, Việt Nam', '197', 21.586097, 105.812604),
('037', 'Osaka Sushi', '+84 387 845 290', '394 Phan Đình Phùng, Đồng Quang, Thành phố Thái Nguyên, Thái Nguyên, Việt Nam', '197', 21.580028, 105.835788),
('038', 'Nhà hàng Duy Mạnh Restaurant', '', 'Phan Đình Phùng, Thành phố Thái Nguyên, Thái Nguyên, Việt Nam', '197', 21.585636, 105.852681),
('039', 'Lẩu 153', '', 'Phan Đình Phùng, Thành phố Thái Nguyên, Thái Nguyên, Việt Nam', '197', 21.591272, 105.839007),
('04', 'Nhà Hàng Hương Việt - Đặc Sản Núi Rừng', '+84 96 128 67 89', 'Quyết Thắng, Thành phố Thái Nguyên, Thái Nguyên, Việt Nam', '197', 21.580558, 105.795692),
('040', 'nhà hàng zone 18', '', 'Quyết Thắng, Thành phố Thái Nguyên, Thái Nguyên, Việt Nam', '197', 21.591147, 105.809092),
('041', 'Nhà hàng ICTU-HB222', '+84 384 276 222', 'Công nghệ thông tin 50m, 222 Đường Z115, Cách cổng phụ, Quyết Thắng, Tp. Thái Nguyên, Thái Nguyên 25', '197', 21.58716, 105.804751),
('042', 'Nhà Hàng ATK & Coffee', '', 'Phan Đình Phùng, Thành phố Thái Nguyên, Thái Nguyên, Việt Nam', '197', 21.591583, 105.834391),
('043', 'Nhà hàng Chim Bốn Mùa - Thái Nguyên', 'Quang Trung, Thành phố Thái Nguyên, Thái Nguyên, Việt Nam', '+84 97 286 90 98', '197', 21.595275, 105.8156),
('044', 'Nhà Hàng 555', '', 'Khu dân cư Vinaconex, Thành phố Thái Nguyên, Thái Nguyên, Việt Nam', '197', 21.59018, 105.837372),
('046', 'NHÀ HÀNG 169', '+84 91 538 85 23', 'Chùa Hang, Đồng Hỷ, Thái Nguyên, Việt Nam', '197', 21.619824, 105.840536),
('047', 'Nhà Hàng Thân Thủy CS 2', '+84 366 155 782', 'Số Nhà 68, Phố Hồ Đắc Di, Tổ 18, Tân Thịnh, Thành phố Thái Nguyên, Thái Nguyên, Việt Nam', '197', 21.569154, 105.823663),
('048', 'Nhà Hàng Hoàng Lực', '+84 97 251 30 22', 'Thịnh Đán, Thành phố Thái Nguyên, Thái Nguyên, Việt Nam', '197', 21.574692, 105.813459),
('05', 'Nhà hàng Việt Thái', '', 'Tân Thịnh, Thành phố Thái Nguyên, Thái Nguyên, Việt Nam', '197', 21.578569, 105.81384),
('050', 'Nhà Hàng Sao Bắc', '', 'Hoàng Gia, Tân Thịnh, Thành phố Thái Nguyên, Thái Nguyên, Việt Nam', '197', 21.579045, 105.816808),
('051', 'Nhà hàng Chung Duy', '+84 91 754 13 88', 'Đồng Quang, Thành phố Thái Nguyên, Thái Nguyên, Việt Nam', '197', 21.583718, 105.824855),
('052', 'nhà hàng Công Tuấn', '+84 383 788 163', 'QL37, Hàng Văn Thụ0, Thành phố Thái Nguyên, Thái Nguyên, Việt Nam', '197', 21.602573, 105.821015),
('06', 'Quán cay Đức Huệ', '+84 96 692 22 88', '255 Quang Trung, Tân Thịnh, Thành phố Thái Nguyên, Thái Nguyên, Việt Nam', '197', 21.577038, 105.813787),
('07', 'Nhà Hàng Trần Huân', '+84 91 440 55 23', 'Tân Thịnh, Thành phố Thái Nguyên, Thái Nguyên, Việt Nam', '197', 21.577794, 105.8178),
('08', 'Nhà Hàng Đồng Rừng', '', 'Quang Trung, Thành phố Thái Nguyên, Thái Nguyên, Việt Nam', '197', 21.581499, 105.81723),
('09', 'Nhà Hàng Thịt Chó Cây Sung', '+84 96 331 44 08', 'Ga Thái Nguyên, Phường Quang Trung, Quang Trung, Thành phố Thái Nguyên, Thái Nguyên, Việt Nam', '197', 21.585076, 105.820681),
('1', '2D Coffee', '+84 375 527 221', 'Đường Z 115, Quyết Thắng, Thành phố Thái Nguyên, Thái Nguyên, Việt Nam', '125', 21.587176, 105.804705),
('10', 'Tân Thịnh, Thành phố Thái Nguyên, Thái Nguyên, Việt Nam', '', 'Tân Thịnh, Thành phố Thái Nguyên, Thái Nguyên, Việt Nam', '125', 21.585479, 105.813956),
('11', 'H2in Coffee', '+84 208 3704 686', 'Tân Thịnh, Thành phố Thái Nguyên, Thái Nguyên, Việt Nam', '125', 21.585611, 105.814125),
('12', 'Coffee Sim Số', '', 'Tân Thịnh, Thành phố Thái Nguyên, Thái Nguyên, Việt Nam', '125', 21.586241, 105.813428),
('13', 'Notes Coffee 2 - Cafe and Music', '', 'Tân Thịnh, Thành phố Thái Nguyên, Thái Nguyên, Việt Nam', '125', 21.587843, 105.813227),
('14', 'Bus Coffee', '', 'Tân Thịnh, Thành phố Thái Nguyên, Thái Nguyên, Việt Nam', '125', 21.588222, 105.813033),
('15', 'Nhà sàn cuối ngõ', '+84 96 518 41 44', 'Quang Trung, Thành phố Thái Nguyên, Thái Nguyên, Việt Nam', '125', 21.59498, 105.816639),
('2', 'Cà phê Xanh', '+84 96 278 20 26', 'Ngõ 167 Z115, Tân Thịnh, Thành phố Thái Nguyên, Thái Nguyên, Việt Nam', '125', 21.582638, 105.807151),
('3', '2 Lúa Coffee', '+84 98 423 57 31', 'Tân Thịnh, Thành phố Thái Nguyên, Thái Nguyên, Việt Nam', '125', 21.583047, 105.80897),
('4', 'Trà Sữa Guo Cha', '+84 399 152 404', 'Tân Thịnh, Thành phố Thái Nguyên, Thái Nguyên, Việt Nam', '125', 21.58307, 105.808611),
('5', '+84 97 805 91 73', '+84 97 805 91 73', '0 Đường Z 115, Tân Thịnh, Thành phố Thái Nguyên, Thái Nguyên, Việt Nam', '125', 21.583243, 105.808856),
('562', 'Sakura', '0963510217', 'Xóm đình phú, đội 3', '125', 21.726749, 105.70737),
('6', 'Tùng Coffee-acoustic', '+84 364 880 023', '0 Đường Z 115, Tân Thịnh, Thành phố Thái Nguyên, Thái Nguyên, Việt Nam', '125', 21.583586, 105.810162),
('7', 'Coffee liên khu 1', '+84 96 826 68 86', 'tổ 6, Thành phố Thái Nguyên, Thái Nguyên, Việt Nam', '125', 21.581463, 105.81277),
('8', 'Cà Phê Hoàng Gia', '+84 91 525 98 88', 'Hoàng Gia, Tân Thịnh, Thành phố Thái Nguyên, Thái Nguyên, Việt Nam', '125', 21.579178, 105.816665),
('9', 'Ci house coffee', '+84 98 505 40 53', '256 Hoàng Gia, Tân Thịnh, Thành phố Thái Nguyên, Thái Nguyên, Việt Nam', '125', 21.576968, 105.818025);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `loai`
--
ALTER TABLE `loai`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `monan`
--
ALTER TABLE `monan`
  ADD PRIMARY KEY (`id`),
  ADD KEY `quan` (`quan`);

--
-- Indexes for table `quanan`
--
ALTER TABLE `quanan`
  ADD PRIMARY KEY (`id`),
  ADD KEY `loai` (`loai`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `monan`
--
ALTER TABLE `monan`
  ADD CONSTRAINT `monan_ibfk_1` FOREIGN KEY (`quan`) REFERENCES `quanan` (`id`);

--
-- Constraints for table `quanan`
--
ALTER TABLE `quanan`
  ADD CONSTRAINT `quanan_ibfk_1` FOREIGN KEY (`loai`) REFERENCES `loai` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
