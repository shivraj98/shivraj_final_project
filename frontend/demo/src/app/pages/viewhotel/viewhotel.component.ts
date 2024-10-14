import { Component, OnInit } from '@angular/core';
import { HotelserviceService } from '../../services/hotelservice.service';
import { Hotel } from '../../interface/reponse';
import { HeaderComponent } from '../../components/header/header.component';
import { FormControl, FormGroup, ReactiveFormsModule, Validators } from '@angular/forms';

@Component({
  selector: 'app-viewhotel',
  standalone: true,
  imports: [HeaderComponent,ReactiveFormsModule],
  templateUrl: './viewhotel.component.html',
  styleUrl: './viewhotel.component.css'
})
export class ViewhotelComponent  implements OnInit{

 hotels:Hotel[]=[];

 filterObject:boolean=false;


 updateModalVisible :boolean=false;


  filterReposne:Hotel[]=[];

   city=new FormControl("",[Validators.required])
   min=new FormControl("",[])
   max=new FormControl("",[])


   filterForm = new FormGroup({
       city:this.city,
       min:this.min,
       max:this.max
   })

  constructor(private hotelService:HotelserviceService){}
  ngOnInit(): void {

    this.hotelService.getAllHotels().subscribe((reposne)=>{
      console.log(reposne);
     this.hotels=reposne.data;

     console.log( this.hotels);
    })
  }


  filterHotel(){
   
  //   if(this.filterForm.value.city!=null && this.filterForm.value.min!=null){
  //     this.filterReposne= this.hotels.filter((ele=>ele.city== this.filterForm.value.city && ele.rating==this.filterForm.value.min));
  //   }
  //    else if(this.filterForm.value.city && this.filterForm.value.max!=null){
  //     this.filterReposne= this.hotels.filter((ele=>ele.city== this.filterForm.value.city && ele.rating==this.filterForm.value.min));
  
  //  else 
   if(this.filterForm.value.city!=null){
      this.filterReposne=this.hotels.filter((ele=>ele.city== this.filterForm.value.city));
       
        
    

      console.log( this.filterReposne);
      this.filterObject =true;
      this.updateModalVisible =false;
    
    }

  }
}
    

    
    

  




