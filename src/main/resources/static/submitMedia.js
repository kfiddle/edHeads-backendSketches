const submitButton = document.getElementById('submitButton');


submitButton.addEventListener('click', () => {
        let pageLocation = document.getElementById('pageLocationInput').value;
        let adTagUrl = document.getElementById('adTagUrl').value;
        let columnPositionA = document.getElementById('columnAInput').value;
        let columnPositionB = document.getElementById('columnBInput').value;
        let columnPositionC = document.getElementById('columnCInput').value;


        let newMedia = {
            adTagUrl: adTagUrl,
            pageTitle: pageLocation,
            columnPositionA: columnPositionA,
            columnPositionB: columnPositionB,
            columnPositionC: columnPositionC
        }

        fetch("http://localhost:8080/add-media", {
            method: "POST",
            headers: {
                "Content-Type": "application/json",

            },
            body: JSON.stringify(newMedia),
        }).then(response => console.log(response));


    }
)


