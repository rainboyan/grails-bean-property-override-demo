package org.grails.demo

class BookService {
    String webServiceURL = 'http://localhost:8080'

    void getBooks() {
        println 'webServiceURL: ' + this.webServiceURL
    }
}