package com.inher.quest1;

public class CompanyMain {
	public static void main(String[] args) {
		Project projTeamOne = new TeamOne();
		projTeamOne.doTask();
		((TeamOne) projTeamOne).softwaresUsed("Eclipse", "Jenkins", "Maven");
		
		Project projTeamTwo = new TeamTwo();
		projTeamTwo.doTask();
		String[] tools = ((TeamTwo)projTeamTwo).getTechStack();
		for(String tool : tools) {
			System.out.println(" " + tool);
		}
	}
}
