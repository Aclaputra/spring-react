curl --location --request PUT 'http://localhost:9191/updateProduct' \
  --header 'Content-Type: application/json' \
  --data-raw '{
      "id": 4,
      "name": "macbook",
      "quantity": 99,
      "price": 23213
  }'
