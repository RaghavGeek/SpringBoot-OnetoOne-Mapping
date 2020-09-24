# SpringBoot-OnetoOne-Mapping
ONE TO ONE Association Sample
----------------------------------------------------
POST Request - http://localhost:8080/api/product

{
"prod":{
"PRODUCT_ID":"50",
"NAME":"Chair",
"DESCRIPTION":"Good Quality",
"CATEGORY":"ABC",
"VALID_FROM":"2020-12-12",
"VALID_TO":"2022-12-12",
"QTY":"2"
	},
"AMOUNT":"1000",
"CURRENCY":"IND",
"VALID_FROM":"2020-12-12",
"VALID_TO":"2022-12-12"	
}

---------------------------------------------------
POST Request - http://localhost:8080/api/placeorder
{
"order":{
"PRODUCT_ID":"50",
"TOTAL_PRICE":"1500"
},
"STAGE_ID":"0",
"STATUS":"Shipping In Progress",
"START_TIME":"2020-12-12",
"END_TIME_TIME":"2022-12-12"
}
