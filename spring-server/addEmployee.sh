curl --location --request POST 'http://localhost:9191/addemployee' \
  --header 'Content-Type: application/json' \
  --data-raw '{
      "name": "Athaya",
      "position": "Backend Engineer Intern",
      "salary": 13000
  }'
