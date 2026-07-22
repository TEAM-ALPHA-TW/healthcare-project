import { Component } from '@angular/core';

@Component({
  selector: 'app-clinical-trailmatcher',
  templateUrl: './clinical-trailmatcher.component.html',
  styleUrls: ['./clinical-trailmatcher.component.css']
})
export class ClinicalTrailmatcherComponent {

  searchDisease: string = '';
  searchAge: number | null = null;

  trials = [
    {
      id: 'CT001',
      disease: 'Diabetes',
      title: 'Diabetes Research Trial',
      location: 'Hyderabad',
      status: 'Recruiting',
      minAge: 18,
      maxAge: 60
    },
    {
      id: 'CT002',
      disease: 'Hypertension',
      title: 'Heart Care Study',
      location: 'Bangalore',
      status: 'Recruiting',
      minAge: 25,
      maxAge: 65
    },
    {
      id: 'CT003',
      disease: 'Cancer',
      title: 'Cancer Immunotherapy',
      location: 'Chennai',
      status: 'Recruiting',
      minAge: 35,
      maxAge: 70
    }
  ];

  get filteredTrials() {
    return this.trials.filter(trial =>
      trial.disease.toLowerCase().includes(this.searchDisease.toLowerCase()) &&
      (
        this.searchAge == null ||
        (this.searchAge >= trial.minAge && this.searchAge <= trial.maxAge)
      )
    );
  }

  searchTrials(): void {

    if (this.searchDisease.trim() === '') {
      alert('Please enter a disease name.');
      return;
    }

    if (this.filteredTrials.length === 0) {
      alert('No matching clinical trials found.');
    } else {
      alert(this.filteredTrials.length + ' trial(s) found.');
    }

  }

  matchTrial(trial: any): void {

    alert(
      "✅ Trial Matched Successfully!\n\n" +
      "Trial ID: " + trial.id +
      "\nTitle: " + trial.title +
      "\nDisease: " + trial.disease +
      "\nLocation: " + trial.location +
      "\nStatus: " + trial.status
    );

  }

}