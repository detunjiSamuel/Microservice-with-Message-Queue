
FROM node:14-alpine



WORKDIR /usr/src/app/api_gateway

COPY package*.json ./

RUN npm install


ARG PORT=3000

COPY . . 

EXPOSE $PORT 3000
CMD [ "npm", "start" ]
