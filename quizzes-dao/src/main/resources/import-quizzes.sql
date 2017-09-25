--
-- Base de données :  `quizzes`
--

-- --------------------------------------------------------

--
-- Contenu de la table `level`
--

INSERT INTO `level` (`id`, `label`) VALUES
(1, 'Beginner'),
(2, 'Intermediate');

-- --------------------------------------------------------

--
-- Contenu de la table `question`
--

INSERT INTO `question` (`id`, `label`, `level_id`) VALUES
(1, 'Quel est le rapport entre Java et JavaScript ?', 1),
(2, 'Laquelle de ces syntaxes est correcte ?', 1),
(3, 'Quel attribut des noeuds de l''arbre DOM correspond à l''attribut (X)HTML class?', 1),
(4, 'Dans un fichier JavaScript externe (.js), il faut ?', 1),
(5, 'Lequel de ces types d''événements n''existe pas?', 1),
(6, 'Quelle méthode n''existe pas dans le DOM ?', 1),
(7, 'Laquelle de ces propositions est un nom de variable valide en JavaScript ?', 1),
(8, 'Dans une boucle, l''instruction continue permet de :', 1),
(9, 'var iNum = 12; iNum %= 2; A la suite de cette expression, combien vaut iNum ?', 1),
(10, 'Quelle méthode permet de comparer deux chaînes texte ?', 1);

-- --------------------------------------------------------

--
-- Contenu de la table `questionresponse`
--

INSERT INTO `questionresponse` (`id`, `status`, `question_id`, `response_id`) VALUES
(1, b'0', 1, 1),
(2, b'1', 1, 2),
(3, b'0', 1, 3),
(4, b'0', 1, 4),

(5, b'1', 2, 5),
(6, b'0', 2, 6),
(7, b'0', 2, 7),
(8, b'0', 2, 8),

(9, b'0', 3, 9),
(10, b'0', 3, 10),
(11, b'1', 3, 11),
(12, b'0', 3, 12),

(13, b'0', 4, 13),
(14, b'0', 4, 14),
(15, b'0', 4, 15),
(16, b'1', 4, 40),

(17, b'0', 5, 16),
(18, b'0', 5, 17),
(19, b'1', 5, 18),
(20, b'0', 5, 19),

(21, b'0', 6, 20),
(22, b'0', 6, 21),
(23, b'1', 6, 22),
(24, b'0', 6, 23),

(25, b'0', 7, 24),
(26, b'0', 7, 25),
(27, b'0', 7, 26),
(28, b'1', 7, 27),

(29, b'0', 8, 28),
(30, b'1', 8, 29),
(31, b'0', 8, 30),
(32, b'0', 8, 31),

(33, b'0', 9, 32),
(34, b'0', 9, 33),
(35, b'0', 9, 34),
(36, b'1', 9, 35),

(37, b'0', 10, 36),
(38, b'0', 10, 37),
(39, b'0', 10, 38),
(40, b'1', 10, 39);

-- --------------------------------------------------------

--
-- Contenu de la table `quiz`
--

INSERT INTO `quiz` (`id`, `description`, `label`) VALUES
(1, 'Description For Front-END Quiz', 'Front-END');

-- --------------------------------------------------------

--
-- Contenu de la table `response`
--

INSERT INTO `response` (`id`, `label`) VALUES
(1, 'C''est le même langage, mais le nom  JavaScript  est utilisé pour le code s''exécutant dans une page Web.'),
(2, 'Ce sont deux langages différents, malgré quelques points communs dans la syntaxe.'),
(3, 'Java est une version améliorée de JavaScript.'),
(4, 'Java est une île, ça n''a rien à voir !'),

(5, 'if (a != 2) {}'),
(6, 'if a != 2 {}'),
(7, 'if (a <> 2) {}'),
(8, 'if a <> 2 {}'),

(9, 'class'),
(10, 'CLASS'),
(11, 'className'),
(12, 'kiwi'),

(13, 'entourer le code avec les balises <script> et </script>.'),
(14, 'préciser l’encodage du fichier avec la règle @charset.'),
(15, 'échapper les caractères spéciaux (X)HTML.'),

(16, 'blur'),
(17, 'load'),
(18, 'mouseclick'),
(19, 'mouseout'),

(20, 'document.getElementsByClassName'),
(21, 'document.getElementsByTagName'),
(22, 'document.getElementsByAttribute'),
(23, 'document.getElementById'),

(24, 'var'),
(25, '2a'),
(26, 'NaN'),
(27, '$b'),

(28, 'continuer l''exécution du code après la boucle.'),
(29, 'passer à l''itération suivante.'),
(30, 'revenir au début de l''itération courante.'),
(31, 'supprimer toutes les variables globales.'),

(32, '6'),
(33, '14'),
(34, '0.12'),
(35, '0'),

(36, 'charAt()'),
(37, 'charCodeAt()'),
(38, 'indexOf()'),
(39, 'localeCompare()'),

(40, 'Aucune des réponses précédentes.');


-- --------------------------------------------------------

--
-- Contenu de la table `test`
--

INSERT INTO `test` (`id`, `description`, `duration`, `label`, `quiz_id`) VALUES
(1, 'Description For JavaScript ...', 10, 'JAVASCRIPT', 1);

-- --------------------------------------------------------

--
-- Contenu de la table `testquestion`
--

INSERT INTO `testquestion` (`id`, `question_id`, `test_id`) VALUES
(1, 1, 1),
(2, 2, 1),
(3, 3, 1),
(4, 4, 1),
(5, 5, 1),
(6, 6, 1),
(7, 7, 1),
(8, 8, 1),
(9, 9, 1),
(10, 10, 1);
