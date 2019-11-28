import { Component, OnInit, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-comment',
  templateUrl: './comment.component.html',
  styleUrls: ['./comment.component.css']
})
export class CommentComponent implements OnInit {
  @Output() getComment =new EventEmitter();
  constructor() { }

  ngOnInit() {
  }
  formData(form){
    console.log(form.value);
    this.getComment.emit(form.value);
  }

}
