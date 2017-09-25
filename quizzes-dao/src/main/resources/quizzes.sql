-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Client :  127.0.0.1
-- Généré le :  Lun 25 Septembre 2017 à 10:14
-- Version du serveur :  5.7.14
-- Version de PHP :  5.6.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `quizzes`
--

-- --------------------------------------------------------

--
-- Structure de la table `level`
--

CREATE TABLE `level` (
  `id` bigint(20) NOT NULL,
  `label` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Contenu de la table `level`
--

INSERT INTO `level` (`id`, `label`) VALUES
(1, 'Beginner'),
(2, 'Intermediate');

-- --------------------------------------------------------

--
-- Structure de la table `question`
--

CREATE TABLE `question` (
  `id` bigint(20) NOT NULL,
  `label` varchar(255) DEFAULT NULL,
  `level_id` bigint(20) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Contenu de la table `question`
--

INSERT INTO `question` (`id`, `label`, `level_id`) VALUES
(1, 'Quel est le rapport entre Java et JavaScript ?', 1);

-- --------------------------------------------------------

--
-- Structure de la table `questionresponse`
--

CREATE TABLE `questionresponse` (
  `id` bigint(20) NOT NULL,
  `status` bit(1) NOT NULL,
  `question_id` bigint(20) NOT NULL,
  `response_id` bigint(20) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Contenu de la table `questionresponse`
--

INSERT INTO `questionresponse` (`id`, `status`, `question_id`, `response_id`) VALUES
(1, b'0', 1, 1),
(2, b'1', 1, 2),
(3, b'0', 1, 3),
(4, b'0', 1, 4);

-- --------------------------------------------------------

--
-- Structure de la table `quiz`
--

CREATE TABLE `quiz` (
  `id` bigint(20) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  `label` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Contenu de la table `quiz`
--

INSERT INTO `quiz` (`id`, `description`, `label`) VALUES
(1, 'Description For Front-END Quiz', 'Front-END');

-- --------------------------------------------------------

--
-- Structure de la table `response`
--

CREATE TABLE `response` (
  `id` bigint(20) NOT NULL,
  `label` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Contenu de la table `response`
--

INSERT INTO `response` (`id`, `label`) VALUES
(1, 'C\'est le même langage, mais le nom  JavaScript  est utilisé pour le code s\'exécutant dans une page Web.'),
(2, 'Ce sont deux langages différents, malgré quelques points communs dans la syntaxe.'),
(3, 'Java est une version améliorée de JavaScript.'),
(4, 'Java est une île, ça n\'a rien à voir !');

-- --------------------------------------------------------

--
-- Structure de la table `role`
--

CREATE TABLE `role` (
  `id` bigint(20) NOT NULL,
  `label` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `test`
--

CREATE TABLE `test` (
  `id` bigint(20) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  `duration` int(11) NOT NULL,
  `label` varchar(255) DEFAULT NULL,
  `quiz_id` bigint(20) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Contenu de la table `test`
--

INSERT INTO `test` (`id`, `description`, `duration`, `label`, `quiz_id`) VALUES
(1, 'Description For JavaScript ...', 10, 'JAVASCRIPT', 1);

-- --------------------------------------------------------

--
-- Structure de la table `testquestion`
--

CREATE TABLE `testquestion` (
  `id` bigint(20) NOT NULL,
  `question_id` bigint(20) NOT NULL,
  `test_id` bigint(20) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Contenu de la table `testquestion`
--

INSERT INTO `testquestion` (`id`, `question_id`, `test_id`) VALUES
(1, 1, 1);

-- --------------------------------------------------------

--
-- Structure de la table `user`
--

CREATE TABLE `user` (
  `id` bigint(20) NOT NULL,
  `created` datetime DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `enabled` bit(1) NOT NULL,
  `password` varchar(255) DEFAULT NULL,
  `userName` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `userrole`
--

CREATE TABLE `userrole` (
  `id` bigint(20) NOT NULL,
  `role_id` bigint(20) NOT NULL,
  `user_id` bigint(20) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `usertest`
--

CREATE TABLE `usertest` (
  `id` bigint(20) NOT NULL,
  `test_id` bigint(20) NOT NULL,
  `user_id` bigint(20) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Index pour les tables exportées
--

--
-- Index pour la table `level`
--
ALTER TABLE `level`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `question`
--
ALTER TABLE `question`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKjt63uw271ald6mpa487hifh4a` (`level_id`);

--
-- Index pour la table `questionresponse`
--
ALTER TABLE `questionresponse`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKd11jo3dtmur44y2yb7lh59em7` (`question_id`),
  ADD KEY `FKge2f1ex2bcxq35xgbr858tt16` (`response_id`);

--
-- Index pour la table `quiz`
--
ALTER TABLE `quiz`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `response`
--
ALTER TABLE `response`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `role`
--
ALTER TABLE `role`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `test`
--
ALTER TABLE `test`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKl1tnen2jtmn0cdyhh47dxwfwp` (`quiz_id`);

--
-- Index pour la table `testquestion`
--
ALTER TABLE `testquestion`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKf2f1qhj6q1olrfsrngk547knd` (`question_id`),
  ADD KEY `FKrt39bdhh0uc2k9tpv8l8sshpj` (`test_id`);

--
-- Index pour la table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `userrole`
--
ALTER TABLE `userrole`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKdm5xsn0ukwtm6eibbore303y0` (`role_id`),
  ADD KEY `FKy78f1yo9p519culm4xx5bb3t` (`user_id`);

--
-- Index pour la table `usertest`
--
ALTER TABLE `usertest`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK4jptcd42qewjv7b0nntsxq8ny` (`test_id`),
  ADD KEY `FKi58ko3pfa7mdfa239gdulwg9a` (`user_id`);

--
-- AUTO_INCREMENT pour les tables exportées
--

--
-- AUTO_INCREMENT pour la table `level`
--
ALTER TABLE `level`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT pour la table `question`
--
ALTER TABLE `question`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT pour la table `questionresponse`
--
ALTER TABLE `questionresponse`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT pour la table `quiz`
--
ALTER TABLE `quiz`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT pour la table `response`
--
ALTER TABLE `response`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT pour la table `role`
--
ALTER TABLE `role`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT pour la table `test`
--
ALTER TABLE `test`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT pour la table `testquestion`
--
ALTER TABLE `testquestion`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT pour la table `user`
--
ALTER TABLE `user`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT pour la table `userrole`
--
ALTER TABLE `userrole`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT pour la table `usertest`
--
ALTER TABLE `usertest`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
