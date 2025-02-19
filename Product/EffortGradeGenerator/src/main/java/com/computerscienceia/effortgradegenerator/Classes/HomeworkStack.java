/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.computerscienceia.effortgradegenerator.Classes;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author adith
 */
public class HomeworkStack implements Serializable{
    private HomeworkNodeStack top;

    public HomeworkNodeStack getTop() {
        return top;
    }

    public void setTop(HomeworkNodeStack top) {
        this.top = top;
    }
    
    public HomeworkStack() {
        this.top = null;
        pushCompletionRateNode();
    }
    
    public boolean isEmpty(){
        return top ==null;
    }
    
    public void pushCompletionRateNode(){
        if(isEmpty()){
            top = new HomeworkNodeStack(false, true, 1.0, "completionRateNode", "None", new Date());
        }else{
            HomeworkNodeStack temp = top;
            ArrayList<Boolean> completedList = new ArrayList<>();
            while(temp!=null){
                completedList.add(temp.isCompleted());
                temp=temp.getNext();
            }
            double percentCompletion = HomeworkPercentageCompletedHelper.calculatePercentageCompleted(completedList);
            HomeworkNodeStack newNode = new HomeworkNodeStack(false, true, percentCompletion, "completionRateNode", "None", new Date());
            newNode.setNext(top);
            top = newNode;
        }
    }
	
    public void addHomework(Date homeworkDueDate, String homeworkName, String descriptionString)
	{
            popCompletionNode();
            HomeworkNodeStack temp = top;
            HomeworkNodeStack newHomework = new HomeworkNodeStack(false, false, 0.0, homeworkName, descriptionString, homeworkDueDate);
		if( isEmpty() )
		{
			top = newHomework;
		} else {
                        newHomework.setNext(top);
			top = newHomework;
                        
		}
            pushCompletionRateNode();
	}
    
    public void printStack(){
        if(isEmpty()){
            System.out.println("Stack is empty");
        }else{
            HomeworkNodeStack temp = top;
            while(temp!=null){
                System.out.println(temp.getHomeworkName());
                temp=temp.getNext();
            }
        }
    }
	
    public Map<String, Double> popCompletionNode()
	{
		if( !isEmpty() )
		{
			String homeworkName = top.getHomeworkName();
                        double percentageCompleted = top.getPercentageCompleted();
			top = top.getNext();
                        Map<String, Double> nodeInformation = new HashMap<>();
                        nodeInformation.put(homeworkName, percentageCompleted);
			return nodeInformation;
		} else {
                        Map<String, Double> nodeInformation = new HashMap<>();
			return nodeInformation;
		}
	}
    
    public void markHomework(String homeworkName, int completed){
        popCompletionNode();
        boolean completionboolean = false;
        if(completed == 0){
            completionboolean = false;
        }else{
            completionboolean = true;
        }
        HomeworkNodeStack temp = top;
        while(temp!=null){
            if(temp.getHomeworkName().equals(homeworkName)){
                temp.setCompleted(completionboolean);
            }
            temp = temp.getNext();
        }
        pushCompletionRateNode();
    }
    
    
    public HomeworkNodeStack popNode()
	{
		if( !isEmpty() )
		{
                    HomeworkNodeStack transferAssessment = new HomeworkNodeStack(top.isCompleted(), top.isPercentageCompletedNode(), top.getPercentageCompleted(), top.getHomeworkName(), top.getDescription(), top.getDueDate());
                    top = top.getNext();
                    return transferAssessment;
		} else {
                        HomeworkNodeStack transferAssessment1 = new HomeworkNodeStack(false, false, 0.0, "No nodes left in stack", "NA", new Date());
			return transferAssessment1;
		}
	}
     
     public void pushNode(HomeworkNodeStack pushNode){
        if(isEmpty()){
            this.top = pushNode;
        }else{
            pushNode.setNext(this.top);
            this.top.setNext(pushNode);
        }
    }
    
    
    public void removeHomework(String homeworkNameString){
        this.popCompletionNode();
        HomeworkStack tempStack = new HomeworkStack();
        tempStack.popCompletionNode();
        HomeworkNodeStack temp = top;
        HomeworkNodeStack temp2;
        if(top.getHomeworkName().equals(homeworkNameString)){
            top=top.getNext();
            this.pushCompletionRateNode();
        }else{
            HomeworkNodeStack transferHomework;
            while(temp!=null){
                if(temp.getHomeworkName().equals(homeworkNameString)){
                    transferHomework = this.popNode();
                    tempStack.pushNode(transferHomework);
                    temp = temp.getNext();
                }else{
                    transferHomework = this.popNode();
                    tempStack.pushNode(transferHomework);
                    temp=temp.getNext();
                }
            }
            temp2 = tempStack.getTop();
            while(temp2 !=null){
                transferHomework = tempStack.popNode();
                this.pushNode(transferHomework);
                tempStack.setTop(tempStack.getTop().getNext());
                temp2 = temp2.getNext();
            }
            this.pushCompletionRateNode();
        }
    }
	
	public Map<String, Double> peekPercentageCompletedValue()
	{
                String homeworkName = top.getHomeworkName();
                double score = top.getPercentageCompleted();
		Map<String, Double> nodeInformation = new HashMap<>();
                nodeInformation.put(homeworkName, score);
                return nodeInformation;
	}
        
    public String getHomeworkcompleted(String homeworkNameString){
        HomeworkNodeStack temp = top;
        boolean completed = false;
        while(temp!=null){
            if (temp.getHomeworkName().equals(homeworkNameString)){
                completed = temp.isCompleted();
            }
            temp = temp.getNext();
        }
        String completedString = "";
        if(completed == true){
            completedString = "Completed";
        }else{
            completedString = "Incomplete";
        }
        return completedString;
    }
    
    
}
