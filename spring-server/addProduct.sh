curl --location --request POST 'http://localhost:9191/addproduct' \
  --header 'Content-Type: application/json' \
  --data-raw '{
    "name": "Keyboard",
        "quantity": 52,
            "price": 29000
}'
