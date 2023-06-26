const { Games, AllGames } = require('../views/Games');
var express = require('express');
var router = express.Router();

AllGames.listGames = [
  new Games('Atari', 'Atari', '1983'), 
  new Games('NES', 'Nintendo', '1983'), 
  new Games('Master System', 'Sega', '1987'), 
  new Games('Game Boy', 'Nintendo', '1989'), 
  new Games('Mega Drive', 'Sega', '1988'), 
  new Games('Super Nintendo', 'Nintendo', '1990'), 
  new Games('Playstation', 'Sony', '1994'), 
  new Games('Nintendo 64', 'Nintendo', '1996')
]

/**
 * @swagger
 * /geek/games:
 *   get:
 *     tags: [Games]
 *     responses:
 *       200:
 *         content:
 *           application/json:
 *             schema:
 *               type: array
 */
router.get('/games', function(req, res) {
  console.info('Buscando lista de vídeo games.');
  res.status(200).json(AllGames.listGames);
});

/**
 * @swagger
 * /geek/games/owner/{owner}:
 *   get:
 *     tags: [Games]
 *     parameters:
 *       - in: path
 *         name: owner
 *         schema:
 *           type: string
 *         required: true
 *     responses:
 *       200:
 *         content:
 *           application/json:
 *             schema:
 *               type: array
 */
router.get('/games/owner/:owner', function(req, res) {
  console.info('Buscando vídeo games do mesmo proprietário.');
  const owner = req.params['owner'];
  const games = AllGames.listGames.filter(x => x.owner === owner);
  if (games.length > 0) {
    return res.status(200).json(games);
  } else {
    res.status(404).json('Vídeo game não encontrado na lista para esse proripetário.');
  }
});

/**
 * @swagger
 * /geek/games:
 *   post:
 *     tags: [Games]
 *     requestBody:
 *       required: true
 *       content:
 *         application/json:
 *           schema:
 *             type: object
 *     responses:
 *       200:
 *         content:
 *           application/json:
 *             schema:
 *               type: array
 */
router.post('/games', function(req, res) {
  console.info('Acrescentando um vídeo game.');
  const game = req.body;
  AllGames.listGames.push(game);
  res.status(201).json(AllGames.listGames);
});

/**
 * @swagger
 * /geek/games/{owner}:
 *   delete:
 *     tags: [Games]
 *     parameters:
 *       - in: path
 *         name: owner
 *         schema:
 *           type: string
 *         required: true
 *     responses:
 *       200:
 *         content:
 *           application/json:
 *             schema:
 *               type: array
 */
router.delete('/games/:name', function(req, res) {
  console.info('Removendo um vídeo game.');
  const name = req.params['name'];
  const gameIndex = AllGames.listGames.findIndex(x => x.name === name);
  if (gameIndex === -1) {
    res.status(404).json('Vídeo game não encontrado na lista com esse nome.');
  } else {
    AllGames.listGames.splice(gameIndex, 1);
    res.status(200).json(AllGames.listGames);
  }
});

module.exports = router;
