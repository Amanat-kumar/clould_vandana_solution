/** 4 . Create a simple to-do list using JavaScript and the DOM.
 Allow users to add new tasks.
 Display tasks in a list.
 Provide a button to remove each task.
*/

function addTask() {
    let input = document.getElementById("taskInput");
    let taskText = input.value.trim();

    if (taskText === "") {
        alert("Task cannot be empty!");
        return;
    }

    let li = document.createElement("li");
    li.innerHTML = `${taskText} <button class="delete-btn" onclick="removeTask(this)">Delete</button>`;
    
    document.getElementById("taskList").appendChild(li);
    input.value = ""; // Clear input field
}

function removeTask(button) {
    button.parentElement.remove();
}