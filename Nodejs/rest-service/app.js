var express = require('express');
const swaggerJsdoc = require('swagger-jsdoc');
const swaggerUi = require('swagger-ui-express');
var app = express();

const swaggerOptions = {
  definition: {
    openapi: '3.0.0'
  },
  apis: ['./routes/*.js'],
};
const swaggerSpec = swaggerJsdoc(swaggerOptions);
app.use('/api-docs', swaggerUi.serve, swaggerUi.setup(swaggerSpec));

app.use(express.json());
app.use(express.urlencoded({ extended: false }));

var indexRouter = require('./routes/index');
app.use('/geek', indexRouter);

app.listen(3000, () => {
  console.log('Servidor rodando na porta 3000');
});

module.exports = app;
