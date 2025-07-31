-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 03, 2025 at 10:00 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `littlebookhaven`
--

-- --------------------------------------------------------

--
-- Table structure for table `book`
--

CREATE TABLE `book` (
  `bookID` int(10) NOT NULL,
  `title` varchar(60) NOT NULL,
  `author` varchar(50) NOT NULL,
  `year` int(11) NOT NULL,
  `isbn` varchar(15) NOT NULL,
  `publisher` varchar(60) NOT NULL,
  `categoryID` int(10) NOT NULL,
  `price` double(10,2) NOT NULL,
  `stockQuantity` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `book`
--

INSERT INTO `book` (`bookID`, `title`, `author`, `year`, `isbn`, `publisher`, `categoryID`, `price`, `stockQuantity`) VALUES
(1, '1984', 'George Orwell', 1949, '9780451524935', 'Signet Classic', 1, 500.00, 20),
(2, 'Pride and Prejudice', 'Jane Austen', 1813, '9780141439518', 'T. Egerton', 1, 400.00, 15),
(3, 'The Alchemist', 'Paulo Coelho', 1988, '9780061122415', 'HarperOne', 1, 450.00, 18),
(4, 'A Little Life', 'Hanya Yanagihara', 2015, '9780804172707', 'Knopf Doubleday', 1, 1200.00, 10),
(5, 'Normal People', 'Sally Rooney', 2018, '9781984822185', 'Crown Publishing', 1, 700.00, 12),
(6, 'Beloved', 'Toni Morrison', 1987, '9781400033416', 'Vintage', 1, 700.00, 14),
(7, 'All the Light We Cannot See', 'Anthony Doerr', 2014, '9781501173219', 'Scribner', 1, 800.00, 13),
(8, 'The Hobbit', 'J.R.R. Tolkien', 1937, '9780547928227', 'HarperCollins', 1, 600.00, 25),
(9, 'Harry Potter and the Philosopher’s Stone', 'J.K. Rowling', 1997, '9780747532699', 'Bloomsbury', 1, 500.00, 30),
(10, 'The Seven Husbands of Evelyn Hugo', 'Taylor Jenkins Reid', 2017, '9781501139239', 'Atria Books', 1, 800.00, 16),
(11, 'Sapiens: A Brief History of Humankind', 'Yuval Noah Harari', 2011, '9780062316097', 'Harper', 2, 750.00, 20),
(12, 'Educated', 'Tara Westover', 2018, '9780399590504', 'Random House', 2, 680.00, 18),
(13, 'The Immortal Life of Henrietta Lacks', 'Rebecca Skloot', 2010, '9781400052189', 'Crown Publishing', 2, 720.00, 16),
(14, 'Becoming', 'Michelle Obama', 2018, '9781524763138', 'Crown Publishing', 2, 950.00, 22),
(15, 'The Wright Brothers', 'David McCullough', 2015, '9781476728759', 'Simon & Schuster', 2, 630.00, 14),
(16, 'Thinking, Fast and Slow', 'Daniel Kahneman', 2011, '9780374533557', 'Farrar, Straus & Giroux', 2, 800.00, 19),
(17, 'Quiet: The Power of Introverts', 'Susan Cain', 2012, '9780307352156', 'Crown Publishing', 2, 700.00, 15),
(18, 'Outliers', 'Malcolm Gladwell', 2008, '9780316017930', 'Little, Brown and Company', 2, 670.00, 17),
(19, 'Born a Crime', 'Trevor Noah', 2016, '9780399588198', 'Spiegel & Grau', 2, 710.00, 21),
(20, 'The Power of Habit', 'Charles Duhigg', 2012, '9780812981605', 'Random House', 2, 690.00, 18),
(21, 'The Girl with the Dragon Tattoo', 'Stieg Larsson', 2005, '9780307454546', 'Knopf Doubleday', 3, 700.00, 18),
(22, 'Gone Girl', 'Gillian Flynn', 2012, '9780307588371', 'Crown Publishing Group', 3, 650.00, 15),
(23, 'Big Little Lies', 'Liane Moriarty', 2014, '9780399167065', 'Penguin Books', 3, 600.00, 20),
(24, 'The Da Vinci Code', 'Dan Brown', 2003, '9780307474278', 'Doubleday', 3, 750.00, 22),
(25, 'In the Woods', 'Tana French', 2007, '9780143113492', 'Penguin Books', 3, 680.00, 17),
(26, 'The Silence of the Lambs', 'Thomas Harris', 1988, '9780312924584', 'St. Martin\'s Press', 3, 720.00, 14),
(27, 'And Then There Were None', 'Agatha Christie', 1939, '9780062073488', 'HarperCollins', 3, 550.00, 25),
(28, 'The Hound of the Baskervilles', 'Arthur Conan Doyle', 1902, '9781505255607', 'CreateSpace Independent', 3, 500.00, 30),
(29, 'Sharp Objects', 'Gillian Flynn', 2006, '9780307341556', 'Crown Publishing Group', 3, 640.00, 16),
(30, 'The Woman in White', 'Wilkie Collins', 1859, '9781503215153', 'CreateSpace Independent', 3, 520.00, 19),
(31, 'Dune', 'Frank Herbert', 1965, '9780441172719', 'Ace Books', 4, 900.00, 20),
(32, 'Ender\'s Game', 'Orson Scott Card', 1985, '9780812550702', 'Tor Books', 4, 700.00, 18),
(33, 'Neuromancer', 'William Gibson', 1984, '9780441569595', 'Ace Books', 4, 680.00, 16),
(34, 'The Martian', 'Andy Weir', 2011, '9780553418026', 'Crown Publishing', 4, 750.00, 22),
(35, 'Snow Crash', 'Neal Stephenson', 1992, '9780553380958', 'Bantam Books', 4, 720.00, 19),
(36, 'Fahrenheit 451', 'Ray Bradbury', 1953, '9781451673319', 'Simon & Schuster', 4, 600.00, 24),
(37, 'Brave New World', 'Aldous Huxley', 1932, '9780060850524', 'Harper Perennial Modern', 4, 620.00, 21),
(38, 'Foundation', 'Isaac Asimov', 1951, '9780553293357', 'Spectra', 4, 700.00, 17),
(39, 'The Left Hand of Darkness', 'Ursula K. Le Guin', 1969, '9780441478125', 'Ace Books', 4, 650.00, 15),
(40, 'Ready Player One', 'Ernest Cline', 2011, '9780307887443', 'Crown Publishing', 4, 800.00, 20),
(41, 'The Name of the Wind', 'Patrick Rothfuss', 2007, '9780756404741', 'DAW Books', 5, 800.00, 20),
(42, 'A Game of Thrones', 'George R. R. Martin', 1996, '9780553573404', 'Bantam Books', 5, 850.00, 25),
(43, 'The Way of Kings', 'Brandon Sanderson', 2010, '9780765326355', 'Tor Books', 5, 950.00, 18),
(44, 'The Lies of Locke Lamora', 'Scott Lynch', 2006, '9780553588941', 'Bantam Books', 5, 720.00, 16),
(45, 'The Fellowship of the Ring', 'J.R.R. Tolkien', 1954, '9780547928210', 'HarperCollins', 5, 700.00, 22),
(46, 'The Golden Compass', 'Philip Pullman', 1995, '9780440418320', 'Knopf Doubleday', 5, 680.00, 19),
(47, 'Eragon', 'Christopher Paolini', 2002, '9780375826696', 'Knopf Books for Young Readers', 5, 650.00, 17),
(48, 'Throne of Glass', 'Sarah J. Maas', 2012, '9781619630345', 'Bloomsbury', 5, 700.00, 15),
(49, 'The Priory of the Orange Tree', 'Samantha Shannon', 2019, '9781635570298', 'Bloomsbury', 5, 880.00, 13),
(50, 'Mistborn: The Final Empire', 'Brandon Sanderson', 2006, '9780765311788', 'Tor Books', 5, 750.00, 20),
(51, 'The Book Thief', 'Markus Zusak', 2005, '9780375842207', 'Knopf Books for Young Readers', 6, 750.00, 20),
(52, 'All the Light We Cannot See', 'Anthony Doerr', 2014, '9781501173219', 'Scribner', 6, 800.00, 18),
(53, 'The Nightingale', 'Kristin Hannah', 2015, '9781250080400', 'St. Martin’s Press', 6, 720.00, 16),
(54, 'A Tale of Two Cities', 'Charles Dickens', 1859, '9780486417769', 'Dover Publications', 6, 400.00, 25),
(55, 'The Help', 'Kathryn Stockett', 2009, '9780425232200', 'Penguin Books', 6, 650.00, 19),
(56, 'War and Peace', 'Leo Tolstoy', 1869, '9780199232765', 'Oxford University Press', 6, 900.00, 14),
(57, 'The Other Boleyn Girl', 'Philippa Gregory', 2001, '9780743227445', 'Touchstone', 6, 670.00, 13),
(58, 'Girl with a Pearl Earring', 'Tracy Chevalier', 1999, '9780452282154', 'Plume Books', 6, 600.00, 17),
(59, 'The Pillars of the Earth', 'Ken Follett', 1989, '9780451225244', 'Signet', 6, 850.00, 15),
(60, 'The Guernsey Literary and Potato Peel Pie Society', 'Mary Ann Shaffer & Annie Barrows', 2008, '9780385341004', 'Dial Press', 6, 680.00, 21),
(61, 'Me Before You', 'Jojo Moyes', 2012, '9780143124542', 'Penguin Books', 7, 700.00, 20),
(62, 'The Notebook', 'Nicholas Sparks', 1996, '9780446605236', 'Grand Central Publishing', 7, 650.00, 18),
(63, 'It Ends with Us', 'Colleen Hoover', 2016, '9781501110368', 'Atria Books', 7, 750.00, 25),
(64, 'The Fault in Our Stars', 'John Green', 2012, '9780525478812', 'Dutton Books', 7, 720.00, 21),
(65, 'Outlander', 'Diana Gabaldon', 1991, '9780440212560', 'Dell Publishing', 7, 780.00, 16),
(66, 'Eleanor & Park', 'Rainbow Rowell', 2013, '9781250012579', 'St. Martin’s Press', 7, 680.00, 14),
(67, 'The Rosie Project', 'Graeme Simsion', 2013, '9781476729091', 'Simon & Schuster', 7, 710.00, 15),
(68, 'Red, White & Royal Blue', 'Casey McQuiston', 2019, '9781250316776', 'St. Martin’s Griffin', 7, 790.00, 13),
(69, 'People We Meet on Vacation', 'Emily Henry', 2021, '9781984806758', 'Berkley Books', 7, 750.00, 17),
(70, 'The Time Traveler’s Wife', 'Audrey Niffenegger', 2003, '9780156029438', 'Harvest Books', 7, 770.00, 19),
(71, 'The Girl with the Dragon Tattoo', 'Stieg Larsson', 2005, '9780307454546', 'Vintage Crime/Black Lizard', 8, 780.00, 20),
(72, 'Gone Girl', 'Gillian Flynn', 2012, '9780307588371', 'Crown Publishing', 8, 750.00, 18),
(73, 'The Da Vinci Code', 'Dan Brown', 2003, '9780307474278', 'Anchor Books', 8, 800.00, 25),
(74, 'The Silent Patient', 'Alex Michaelides', 2019, '9781250301697', 'Celadon Books', 8, 820.00, 22),
(75, 'Before I Go to Sleep', 'S.J. Watson', 2011, '9780062060563', 'HarperCollins', 8, 690.00, 16),
(76, 'The Reversal', 'Michael Connelly', 2010, '9780316069484', 'Little, Brown and Company', 8, 720.00, 15),
(77, 'Behind Closed Doors', 'B.A. Paris', 2016, '9781250121004', 'St. Martin’s Press', 8, 700.00, 14),
(78, 'The Girl on the Train', 'Paula Hawkins', 2015, '9781594634024', 'Riverhead Books', 8, 740.00, 17),
(79, 'The Couple Next Door', 'Shari Lapena', 2016, '9780735221109', 'Pamela Dorman Books', 8, 730.00, 19),
(80, 'I Am Watching You', 'Teresa Driscoll', 2017, '9781542046596', 'Thomas & Mercer', 8, 710.00, 13),
(81, 'It', 'Stephen King', 1986, '9781501142970', 'Scribner', 9, 900.00, 20),
(82, 'The Shining', 'Stephen King', 1977, '9780307743657', 'Anchor Books', 9, 800.00, 18),
(83, 'The Haunting of Hill House', 'Shirley Jackson', 1959, '9780143039983', 'Penguin Classics', 9, 700.00, 16),
(84, 'Bird Box', 'Josh Malerman', 2014, '9780062259660', 'Ecco', 9, 720.00, 17),
(85, 'Mexican Gothic', 'Silvia Moreno-Garcia', 2020, '9780525620785', 'Del Rey', 9, 850.00, 14),
(86, 'House of Leaves', 'Mark Z. Danielewski', 2000, '9780375703768', 'Pantheon Books', 9, 950.00, 12),
(87, 'The Exorcist', 'William Peter Blatty', 1971, '9780061007224', 'HarperTorch', 9, 750.00, 15),
(88, 'The Silent Corner', 'Dean Koontz', 2017, '9780345545992', 'Bantam', 9, 780.00, 13),
(89, 'Pet Sematary', 'Stephen King', 1983, '9781501156700', 'Gallery Books', 9, 820.00, 19),
(90, 'Something Wicked This Way Comes', 'Ray Bradbury', 1962, '9780062071033', 'Harper Perennial Modern', 9, 730.00, 16),
(91, 'Charlotte’s Web', 'E.B. White', 1952, '9780061124952', 'HarperCollins', 10, 500.00, 25),
(92, 'Matilda', 'Roald Dahl', 1988, '9780142410370', 'Puffin Books', 10, 480.00, 20),
(93, 'The Cat in the Hat', 'Dr. Seuss', 1957, '9780394800011', 'Random House', 10, 450.00, 22),
(94, 'Where the Wild Things Are', 'Maurice Sendak', 1963, '9780064431781', 'HarperCollins', 10, 470.00, 18),
(95, 'The Tale of Peter Rabbit', 'Beatrix Potter', 1902, '9780723247708', 'Warne', 10, 430.00, 24),
(96, 'The Very Hungry Caterpillar', 'Eric Carle', 1969, '9780399226908', 'Philomel Books', 10, 400.00, 28),
(97, 'Green Eggs and Ham', 'Dr. Seuss', 1960, '9780394800166', 'Random House', 10, 450.00, 26),
(98, 'Winnie-the-Pooh', 'A.A. Milne', 1926, '9780525477686', 'Dutton Juvenile', 10, 520.00, 19),
(99, 'Harry Potter and the Philosopher’s Stone', 'J.K. Rowling', 1997, '9780747532699', 'Bloomsbury', 10, 500.00, 30),
(100, 'Diary of a Wimpy Kid', 'Jeff Kinney', 2007, '9780810993136', 'Amulet Books', 10, 490.00, 23),
(101, 'Uprooted', 'Naomi Novik', 2015, '9780804179058', 'Del Rey Books', 5, 750.00, 18);

-- --------------------------------------------------------

--
-- Table structure for table `category`
--

CREATE TABLE `category` (
  `categoryID` int(10) NOT NULL,
  `categoryName` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `category`
--

INSERT INTO `category` (`categoryID`, `categoryName`) VALUES
(1, 'Fiction'),
(2, 'Non-Fiction'),
(3, 'Mystery'),
(4, 'Science Fiction'),
(5, 'Fantasy'),
(6, 'Historical Fiction'),
(7, 'Romance'),
(8, 'Thriller'),
(9, 'Horror'),
(10, 'Children's);

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `userID` int(10) NOT NULL,
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `role` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`userID`, `username`, `password`, `role`) VALUES
(1, 'shanuka', 'shanuka123', 'Manager'),
(2, 'kasun', 'kasun123', 'Cashier'),
(3, 'dasun', 'Dasun123', 'Cashier'),
(4, 'pasan', 'pasan123', 'Cashier'),
(5, 'mathesha', 'mathesha123', 'Cashier'),
(6, 'gayan', 'gayan123', 'Cashier');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `book`
--
ALTER TABLE `book`
  ADD PRIMARY KEY (`bookID`),
  ADD KEY `categoryID` (`categoryID`);

--
-- Indexes for table `category`
--
ALTER TABLE `category`
  ADD PRIMARY KEY (`categoryID`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`userID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `book`
--
ALTER TABLE `book`
  MODIFY `bookID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=102;

--
-- AUTO_INCREMENT for table `category`
--
ALTER TABLE `category`
  MODIFY `categoryID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `userID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `book`
--
ALTER TABLE `book`
  ADD CONSTRAINT `book_ibfk_1` FOREIGN KEY (`categoryID`) REFERENCES `category` (`categoryID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
