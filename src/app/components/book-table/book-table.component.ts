import { Observable } from 'rxjs/internal/Observable';
import { BookService } from './../../services/book.service';
import { BookDTO } from './../../dtos/book.dto';
import { Component } from '@angular/core';
import { observable } from 'rxjs';

@Component({
  selector: 'app-book-table',
  templateUrl: './book-table.component.html',
  styleUrls: ['./book-table.component.scss']
})
export class BookTableComponent implements OnInit {

  books : BookDTO[] = [];

  constructor( private service : BookService) {}

}

ngOnInit(): void{

  this.service.findAllBook()
  .subscribe({

    next: (data) => this.books = data
    ,
    error: (e) => console.error(e)

  });

}


