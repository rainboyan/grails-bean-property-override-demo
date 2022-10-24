package org.grails.demo

class BootStrap {
    def bookService

    def init = { servletContext ->
        bookService.getBooks()
    }
    def destroy = {
    }
}
