import { ElementRef, Directive, HostBinding, HostListener } from '@angular/core';


@Directive({
    
    selector : '[custDir]'
})



export class CustomerDirective {
    constructor (private el : ElementRef) {
        this.el.nativeElement.style.backgroundColor = 'red';

        
    }
    @HostBinding('style.backgroundColor')backgroundColor = 'yellow';
    @HostListener('mouseenter') n()  {
        this.el.nativeElement.style.backgroundColor = 'blue';
    }
    @HostListener('mouseleave') m() {
        this.el.nativeElement.style.backgroundColor = 'red';
    }
}