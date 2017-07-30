# SearchableSpinner
Fully Searchable Spiner Dialog: This is just one library I forked and modified a lot so I could blow through a project at my Place of Primary Assignment (NYSC). Meh 🤷🏿‍♂🤷🏿‍♂🤷🏿‍♂🤷🏿‍♂

Searcahble spinner allows you to add a list of any object of your choice to a spinner dialog and search it.

# Screenshots

|       SCREEN 1  |        SCREEN 2    |   
| ------------- |:-------------:| 
| <img src="Screens/SCREEN1.png" width="250" />    | <img src="Screens/SCREEN2.png" width="250" /> |
 
# Usage

- Initialize your custom object and implement IdentifiableObject
- Overide the methods 
    
```
    public String getSubtitle(); // Return the value you'd like to see as the subtitle like in screenshot, wrap with string.valueof if needed

    public String getTitle(); // Return the value you'd like to see as the title like in screenshot, wrap with string.valueof if needed

    public int getIdentifier(); // Return the identifier value of the item incase you'd need a reference to it for your operations

    public int getRecourseId(); // Return the ID of the drawable to be at beside each item like in screenshots.

```

- Initialize the dialog and show it. 
```
 items.add(new IdentifiableObjectImpl("Mumbai", "India", 0, R.drawable.ic_checkbox_marked_circle_outline_white_18dp));
        items.add(new IdentifiableObjectImpl("Delhi", "India", 0, R.drawable.ic_checkbox_marked_circle_outline_white_18dp));
        items.add(new IdentifiableObjectImpl("Bengaluru", "India", 0, R.drawable.ic_checkbox_marked_circle_outline_white_18dp));
        items.add(new IdentifiableObjectImpl("Hyderabad", "India", 0, R.drawable.ic_checkbox_marked_circle_outline_white_18dp));
        items.add(new IdentifiableObjectImpl("Ahmedabad", "India", 0, R.drawable.ic_checkbox_marked_circle_outline_white_18dp));
        items.add(new IdentifiableObjectImpl("Chennai", "India", 0, R.drawable.ic_checkbox_marked_circle_outline_white_18dp));
        items.add(new IdentifiableObjectImpl("Kolkata", "India", 0, R.drawable.ic_checkbox_marked_circle_outline_white_18dp));
        items.add(new IdentifiableObjectImpl("Surat", "India", 0, R.drawable.ic_checkbox_marked_circle_outline_white_18dp));
        items.add(new IdentifiableObjectImpl("Pune", "India", 0, R.drawable.ic_checkbox_marked_circle_outline_white_18dp));
        items.add(new IdentifiableObjectImpl("Jaipur", "India", 0, R.drawable.ic_checkbox_marked_circle_outline_white_18dp));
        items.add(new IdentifiableObjectImpl("Lucknow", "India", 0, R.drawable.ic_checkbox_marked_circle_outline_white_18dp));
        items.add(new IdentifiableObjectImpl("Kanpur", "India", 0, R.drawable.ic_checkbox_marked_circle_outline_white_18dp));

        spinnerDialog = new SpinnerDialog(MainActivity.this, items, "Select or Search City", R.style.DialogAnimations_SmileWindow, R.drawable.ic_map_marker_white_24dp, R.drawable.ic_crosshairs_gps_white_18dp);

        spinnerDialog.bindOnSpinerListener(new OnSpinerItemClick() {
            @Override
            public void onClick(IdentifiableObject item, int position) {
                Toast.makeText(MainActivity.this, item.getTitle() + "  " + item.getRecourseId() + "", Toast.LENGTH_SHORT).show();
                selectedItems.setText(item.getTitle() + " Position: " + item.getSubtitle());
            }
        });
```