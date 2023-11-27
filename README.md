# CricAPI

**This is a RestAPI which is based on Cricket matches and points table.**

Features:
 - return list of live matches ( through web scrapping ) and stores them into MySQL database
 - gets matches that are stored in database
 - gets details of points table ( Odi world cup ) 

Dependecies Used:
 - Spring Web
 - JPA ( to interact with db )
 - jsoup ( to serialize data that is received through web scrapping )
 - lombok
 - mysql-connector

Endpoints exposed:
 - /match/live
 - /match/pointtable

WebScrapping: 
 - Web scraping is the process of extracting content and data from a website.
