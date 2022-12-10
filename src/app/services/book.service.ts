import { BookDTO } from './../dtos/book.dto';
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs/internal/Observable';


@Injectable({
  providedIn: 'root'
})
export class BookService {

  constructor(private client: HttpClient) { }

  public findAllBooks(): Observable<BookDTO[]> {
      return this.client.get<BookDTO[]>('http://localhost:8080/book');
    }

}
