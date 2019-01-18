package com.abdul.app.texephyr.events;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Abdul Noushad (abdulnine7)
 */
public class Event {

    private final static Map<String, List<Event>> events = new HashMap<>();

    public static Map<String, List<Event>> getEvents() {
        events.clear();

        List<Event> comp_events;
        List<Event> mech_events;
        List<Event> entc_events;
        List<Event> gaming_events;
        List<Event> nontech_events;
        List<Event> project_events;


        comp_events = new ArrayList<>();
        //comp_events.add(new Event("", "", ""));
        comp_events.add(new Event("Alghololics", "High on efficiency", "Max. No. of Participants:  2\n" +
                "\nRegistration Fees:\nRs150 (single entry)\n" +
                "Rs.200 (team of two)\n" +
                "\nNo. of rounds:   3\n" +
                "\n" +
                "Introduction:\n" +
                "Algoholics, as the name suggests, is an algorithm based event which tests\n" +
                "your logical thinking rather than testing your coding abilities. The motto\n" +
                "of the event is Think efficient, build efficient.\n" +
                "\nThe following are the rounds in the event:\n" +
                "\nRound 1- Logical questions (30 mins)\n" +
                "Questions to test your logics, basic aptitude and computer knowledge\n" +
                "will be asked. + BONUS ROUND\n" +
                "\nRound 2- Answering from pseudo code (30 mins)\n" +
                "The participant will be provided with a pseudo code on which an input will\n" +
                "be given and output is to be answered.\n" +
                "\nRound 3- Algorithm development (60 mins)\n" +
                "A problem statement will be given for which an algorithm has to be built.\n" +
                "The algorithm will be evaluated on the basis of its correctness, efficiency\n" +
                "and time for solving (quickness). Evaluation will be done by judges\n" +
                "from the industries." +
                "\n\n" +
                "Prizes :\n" +
                "\t1st\t:\t6000\n" +
                "\t2st\t:\t4000\n\n"));

        comp_events.add(new Event("CODE-BREAK", "Break the code!", "Max. No. of Participants: 2\n" +
                "\nRegistration fee:\nRs.150 (Single entry) \n" +
                "Rs.200 (team of two)\n" +
                "\nNo. of rounds: 3\n" +
                "\nROUND I : Djigksaw Puzzle\n" +
                "For all the inquisitives who love solving puzzles. The twist here is that the code will be puzzled and the participant has to put all the snippets in the right place.\n" +
                "\nEvent format:\n" +
                "It will consist of three levels- simple, medium, hard. The participant starts from simple level. On every correct answer, the participant gets a problem statement from the next level and on every wrong answer, the level will be reduced with an added penalty. Every level has a fixed number of points for each puzzle E.g.\n" +
                "\n" +
                "Level 1 (simple) - if puzzle is solved go to level 2\n" +
                "\n" +
                "Level 2 (medium) - if puzzle is solved go to level 3 if puzzle is unsolved go to level 1 with added penalty\n" +
                "\n" +
                "Level 3 (hard) - if wrong go to level 2 with added penalty\n" +
                "\n" +
                "\n" +
                "ROUND II : Qwerky Code\n" +
                "This round will integrate fun and excitement in coding. There will be various twists in the keyboard that will jumble the minds of the programmers.\n" +
                "\nFormat:\n" +
                "• This round consists of four stages with different twist. In each stage points will be reduced for breaking the rules. At the end of round, points will be awarded on the basis of least number of errors. Bonus points for correct code.\n" +
                "\n" +
                "\n" +
                "ROUND III  : Blind Coding\n\n"
                + "Level 1: You will be given the problem statement and 5 minutes to think about it. After that you will have 15 minutes to type the code. In these 15 minutes, you are allowed to turn on the monitor once under supervision. No rough work will be allowed.\n" +
                "\n" +
                "Level 2: The problem statement will be a bit complex. You will be given 5 minutes along with a chit for rough work. After that, the chits will have to be returned and you will have to type the code with a dysfunctional keyboard (10 mins).\n" +
                "Level 3: You can write on the chits for 5 minutes (you are allowed to keep the chits). 10 mins to code with functional keyboard but no monitor and the final 5 mins of free time for error correction.\n" +
                "\n" +
                "Rules: \n" +
                "Participants should only be from recognized educational institutes/universities.\n" +
                "Participants have to bring their College ID cards and the receipt of registration during reporting.\n" +
                " Time slots will be given and participants are expected to follow it strictly.\n" +
                "Participants are expected to give their correct contact details, so as to inform them about the results.\n" +
                "Details of the round will be disclosed at the time of event.\n" +
                "Rules may be changed without prior intimation.\n" +
                "\n" +
                "Prizes :\n" +
                "\t1st\t:\t9000\n" +
                "\t2st\t:\t6000\n" +
                "\t3st\t:\t3000\n\n"));

        comp_events.add(new Event("CODESTORM", "Be plus plus..!", "Max. No. of Participants: 2\n" +
                "\nRegistration fee:\nRs.150 (For single entry) \n" +
                "Rs.200 (team of two)\n" +
                "\nNo. of rounds: 3 \n" +
                "\n" +
                "\n" +
                "Introduction: \n" +
                "For all the coders TEXEPHYR brings Code storm. Write out the optimised and most efficient code to prove your coding prowess. This event will not only test your coding \t\tbut also evaluate your debugging. \n" +
                "\nEvent format: \n" +
                " They are two completely different tracks:\n1) Minor (Diploma & FE & SE)\n" +
                "2) Major (TE & BE)\n" +
                "\n" +
                "Prizes for both tracks are different.\n" +
                "\n" +
                "Round 1:\nMCQ\n" +
                "Contestants will have to answer set of questions. Questions will be of multiple choice and the contestant has to choose the appropriate one. Questions will be based on technical know-how.\n" +
                "\n" +
                "Round 2:\n" +
                "REVERSE CODING (For Minor)\n" +
                "Contestants will be given input-output sequences and will have to decode the logic behind it. The code can be written in any of the four languages i.e. C, C++, java or python. Both time and correctness of code will be considered.\n" +
                "\n" +
                "\n" +
                "PRACTICAL PROBLEMS (CODES RELATING TO DAILY LIFE PROBLEMS (For Major)) \n" +
                "Feel the technological change that how you recover faster from disaster. Contestants are assumed to be at a zero level initially. Contestants will have to choose one of the given difficulty levels (say around 1 to 5). For each of the difficulty level contestants will be rewarded with certain points if answered correctly (say 100 for difficulty level 1, 200 for 2 and so on).\n" +
                "\n" +
                "Round 3:\nFINAL CODING ROUND\n" +
                "\n" +
                "This round will be a hard core coding round. A problem statement will be provided for which a code needs to be developed. The code can be written in any of the four languages i.e. C, C++, java or python. Both time and correctness of code will be considered.\n" +
                "\n" +
                "Prizes(juniors) :\n" +
                "\t1st\t:\t6000\n" +
                "\t2st\t:\t3000\n" +
                "\t3st\t:\t1000\n" +
                "\n" +
                "Prizes(seniors) :\n" +
                "\t1st\t:\t8000\n" +
                "\t2st\t:\t5000\n" +
                "\t3st\t:\t3000\n\n"));

        comp_events.add(new Event("JUNKYARD WARS", "Playing the part.", "Max. No. of Participants:   2\n" +
                "\nRegistration Fees:\nRs.150(single entry)\n" +
                "Rs.200 (team of two)\n" +
                "\nNo. of rounds:  2\n" +
                "\nIntroduction:\n" +
                "Do you know your PC? Find the right parts and assemble the PC in " +
                "30 minutes. Teamwork is everything to win this war. The competition is " +
                "designed for students to display skills in PC assembly with great " +
                "precision and speed. Students will demonstrate their ability to put " +
                "together a PC from junk parts until it has started to successfully boot. " +
                "\n" +
                "Following components will be provided-\n" +
                "➢Motherboard with attached Processor\n" +
                "➢RAM\n" +
                "➢HDD with Installed OS\n" +
                "➢DVD Drive\n" +
                "➢Heat sink/Fan Combo\n" +
                "➢SMPS\t\n" +
                "\n" +
                "Round 1 (pick, collect and assemble - 30 mins)\n" +
                "➢Different parts of the PC will be missing; participant has to find them from " +
                "the junk of components.\n" +
                "➢Maximum time for assembling is 30 minutes.\n" +
                "➢Fixed no. of screws will be provided. Lose them, and you lose your " +
                "points.\n" +
                "➢You can pick only two components at a time.\n" +
                "➢Points will be awarded for each correct part assembled.\n" +
                "\nTeam will get a second chance if their assembled PC throws up " +
                "errors. Points will be lost, too.\n" +
                "Team with the maximum points will be the winner (within stipulated time " +
                "i.e. 30 minutes.)\n" +
                "\n" +
                "Round 2 (test, assemble with twist)\n" +
                "➢Different parts of the PC will be missing; participant has to find them from " +
                "the junk of components (working + non-working)\n" +
                "➢There will a short test related to the hardware in computer (MCQ based).\n" +
                "➢The time will be allotted according to this quiz.\n" +
                "➢All the assembling steps are same as round 1\n" +
                "\nTeam with the maximum points will be the winner.\n" +
                "\n" +
                "Prizes :\n" +
                "\t1st\t:\t6000\n" +
                "\t2st\t:\t4000\n\n"));

        mech_events = new ArrayList<>();
        mech_events.add(new Event("RALLY MANIA", "For all who believe in setting the place on fire!", "Max. No. Of Participants: 4\n" +
                "\nRegistration Fees:\nRs 400/- per team (team with at least 2 SAE members) \n" +
                "Rs 500/- per team (team with Non SAE members)  \n" +
                "\n" +
                "No. of Rounds: 2\n" +
                "\n" +
                "INTRODUCTION:\n" +
                "For all those who believe in setting the place on fire! Here’s a live experience of a racing tournament. Build your own remote controlled IC engine car and come on board! The operator will be given a ramp to stand on, giving visibility of the track and another team member will be allowed to assist him during the operation.\n" +
                "\n" +
                "ARENA: \n" +
                "The arena will be displayed later on the website.\n" +
                "Rough patches, slopes, obstacles, speed-breakers will be there on the race track.\n" +
                "\n" +
                "SPECIFICATIONS of RC CARS:\n" +
                "The participants must use the vehicle of frequency of 2.4 GHz \n" +
                "The machine must not be made from readymade kits like LEGO or Mechano sets or any other kits available in the market.\n" +
                "However remote controls can be used from various model cars or toys or even those purchased from the market. \n" +
                "The machine may be roughly classified into structural and functional parts: \n" +
                "a) FUNCTIONAL PARTS – Gears, differential gear shift, engine with clutch, pulley and pulley belt, springs, motors and servos (non propulsion purposes only), batteries, wheels and suspensions are allowed to be used as available in the market. \n" +
                "b) STRUCTURAL PARTS - Chassis, body and body cover, steering   mechanism have to be built by the participants themselves. Judging for the same will be strict and the participant will be immediately disqualified if any of the above structural components is found to be ready made. \n" +
                "The team must design the braking mechanism and the mounting suspension system. The body cover should be detachable so that the interior can be inspected. Note that the decision of the judges will be final and binding and any team found guilty of using ready made parts mentioned in this point will be disqualified. \n" +
                "The machine must be propelled forward using IC engines (Max power of 4 CC). But use of any other chemicals, compressed gas, rocket powered systems, DC motors or any other means as found dangerous by the organizers will not be allowed. \n" +
                "Start control mechanism: The start control mechanism must not provide any thrust to the vehicle along direction of motion of track. Those participants using IC engines must note that their starting mechanism must be removable and not interfere with the race.\n" +
                "The vehicle will be inspected before hand and will be disqualified if found dangerous by the judges.\n" +
                "The participants may add some innovative mechanisms (Reverse Mechanism) in their car so as to get bonus points.\n" +
                "\n" +
                "GENERAL RULES:\n" +
                "The participants must place their RC cars at the start line before start of the race. Any RC car starting beforehand will be given a warning and will be allowed to restart. However if they repeat the false start again then the run will be disqualified.\n" +
                "Only the operator shall stand on the controlling ramp.\n" +
                "Only One Member/Team shall be present in the arena.\n" +
                "Every time the vehicle needs to be lifted or reset either due to its stalling, tumbling or running off the track, it shall be placed at nearest previous checkpoint. The team will be disqualified if any damage to the track is observed.\n" +
                "The vehicle cannot be touched for any other reason barring those stated above.\n" +
                "The vehicle must remain intact throughout the race.\n" +
                "Teams will have to deposit their wireless remote controllers with the management while reporting every morning.\n" +
                "No power supply will be given on the track.\n" +
                "Teams are not allowed to purposefully damage the machine of the opponent’s team. If doing so on track (while racing), the concerned team will get disqualified. Any team that is not competing in the right spirit and indulging in misbehavior will be disqualified. Execution of this rule will be subjective and relies completely on judge's discretion.\n" +
                "If the timelines are not strictly followed, the organizers shalldecide the consequences and the decision shall be final and binding to all teams.\n" +
                "THE ORGANIZERS RESERVE THE RIGHTS TO CHANGE ANY OF THE ABOVE MENTIONED RULES AS THEY DEEM FIT.\n" +
                "\n" +
                "ELIGIBILITY CRITERIA: \n" +
                "Any student with valid ID card of their educational institute can participate.\n" +
                "Each participant can be a part of one team only. If same participant is found as a member of more than one team, will lead to disqualification of both teams.\n" +
                "\nPrizes :\n" +
                "\t1st\t:\t50000\n" +
                "\t2st\t:\t30000\n" +
                "\t3st\t:\t20000\n"));
        mech_events.add(new Event("MR.MECHANIX", "See their ideas stand up tall!", "Max. No. Of Team Members: 2\n" +
                "\nRegistration Fees:\nRs 120/- (SAE member participants)\n" +
                " Rs180/- (Non SAE member participants)\n" +
                "\nNo. of Rounds: 2\n" +
                "\n" +
                "INTRODUCTION:\n" +
                "For all those who want to see their ideas stand up tall! This event is a perfect blend of acknowledgement and analyzation of a concept. The event will mainly test your knowledge of the subjects namely SOM and applied mechanics. The final round will be based on model making.\n" +
                "\n" +
                "\nGENERAL RULES AND EVENT FORMAT: \n" +
                "\nRound 1 (Elimination Round): \n" +
                "In this round, there will be a knowledge test consisting of Multiple Choice Questions (MCQ).\n" +
                "MCQs will be based on Engineering Mechanics and Strength of material.\n" +
                "Test duration will be 40 minutes.\n" +
                "\nRound 2 (Final Round): \n" +
                "Teams which will crack Round 1 will compete in this model making round.\n" +
                "An application based problem is to be solved and working model is a must to support their ideas.\n" +
                "All required material for model making will be provided by organizers.\n" +
                "Clear cut theoretical approach must be presented in a step-by-step manner.\n" +
                "Assessment of the model will also be done by the respective judges. \n" +
                "Top three Winners will be decided according to their marks scored in this particular round.\n" +
                "\n" +
                "ELIGIBILITY CRITERIA: \n" +
                "Any student with valid ID card of their educational institute can participate.\n" +
                "\n" +
                "** Prize money may be subjected to change. Organisers reserve the right to change any rules.\n" +
                "\n" +
                "Prizes :\n" +
                "\t1st\t:\t5000\n" +
                "\t2st\t:\t3000\n"));
        mech_events.add(new Event("CONTRAPTION", "Bizarre and uncanny ideas you can think of!", "Max. No. Of Participants: 4\n" +
                "\nRegistration Fees:\nRs 250/- per team\n" +
                "\nNo. of Rounds: 1\n" +
                "\n" +
                "INTRODUCTION: \n" +
                "For those of us, who are tired of straightforward algorithms- put on your thinking hats, and come up with all the bizarre and uncanny ideas you can think of to accomplish the most common tasks. A CONTRAPTION machine is a deliberately over-engineered machine that performs a very simple task in a very complex fashion, usually including a chain reaction. Instead of just “solving” the problem, team have to make the solution as complicated and as convoluted as possible. So go ahead, break the rules, defy all logic, and make life tougher! \n" +
                "\n" +
                "AREA:\n" +
                "The area allotted to each team will be 3m x 3m.\n" +
                "\n" +
                "EVENT GUIDELINES:\n" +
                "\nThe arrangement should complete the contraption in a minimum of 5 steps.\n" +
                "A Step is defined as the action that results in another action working towards the final aim of the contraption/machine.\n" +
                "Each team will be given 2 trials to show their working arrangement. A setup time of 10 minutes will be given for the second trial.\n" +
                "A setup time of 2 hours will be given to every team before their first attempt.\n" +
                "The working time of the arrangement should be less than 3 minutes.\n" +
                "All energy conversions are allowed to drive the contraption (including potential, chemical, electrical, kinetic etc.)\n" +
                "Once initiated, manual intervention is allowed only when the contraption comes to an unexpected halt. Maximum times the manual intervention allowed is 3.\n" +
                "\n" +
                "JUDGEMENT CRITERIA:\n" +
                "\n" +
                "Each unique step carries 10 points.\n" +
                "Each unique Energy conversion carries 50 points. Thereafter if the energy conversion is repeated the points allotted wsould be half the initial points i.e 25 for the first same conversion and 12.5 for the further repetitions.\n" +
                "Each manual intervention made reduces the final score by 15.\n" +
                "Completion of the final task gives 100 points to the team.\n" +
                "In case of a tie the winner between the two teams will be decided by the time taken by the contraption to complete.\n" +
                "\n" +
                "Problem statement will be displayed 20 days prior the competition on the event website. (Link - www.texephyr.in) \n" +
                "\n" +
                "\n" +
                "ELIGIBILITY CRITERIA: \n" +
                "Any student with valid ID card of their educational institute can participate\n" +
                "\n" +
                "Prizes :\n" +
                "\t1st\t:\t10000\n" +
                "\t2st\t:\t5000\n"));
        mech_events.add(new Event("DESIGNER PRO", "Software for designing (modeling)", "Max. No. Of Team members: 1  \t\t  \n" +
                "\nRegistration Fees:\nRs 180/- (SOLID WORKS)\n" +
                "Rs 120/- (AUTOCAD)\n" +
                "\nNo. of Rounds: 3 \n" +
                "\n" +
                "INTRODUCTION:\n" +
                "Hand drafting?! Nah! Here’s something more exciting.  If you like working with a software for designing (modeling), this event is the right choice. One can work with either SOLIDWORKS or AUTOCAD. The event will be conducted in 3 rounds.\n" +
                "\n" +
                "EVENT FORMAT: \n" +
                "\n" +
                "Round 1 (Elimination Round): \n" +
                "It will consist of 50 Multiple Choice Questions on SOLIDWORKS/AUTOCAD software and drafting basics. Time allotted for this round will be 30 minutes.\n" +
                "\n" +
                "Round 2 (Part Modeling): \n" +
                "Participants will be evaluated for following things-\n" +
                "a) Number of parts successfully modelled.\n" +
                "b) Dimensional accuracy of parts modelled.\n" +
                "c) Appropriateness of the features used for part modelling\n" +
                "\n" +
                "Round 3 (Assembly Modeling): \n" +
                "Participants will be evaluated for following things-\n" +
                "a) Number of parts successfully modelled and assembled.\n" +
                "b) Constraining of parts in the assembly.\n" +
                "c) Whether sub-assemblies were used and why.\n" +
                "d) Appropriateness of the constraints used for assembly.\n" +
                "\n" +
                "Prizes(SOLID WORKS) :\n" +
                "\t1st\t:\t5000\n" +
                "\t2st\t:\t3000\n" +
                "\n" +
                "Prizes(AUTOCAD) :\n" +
                "\t1st\t:\t5000\n" +
                "\t2st\t:\t3000\n"));

        entc_events = new ArrayList<>();
        entc_events.add(new Event("ROBORACE", "Racing! Is it in your DNA?", "Max. No. Of  participants: 4\n" +
                "\nRegistration Fees:\n300/- " +
                "(and 50/-  extra for each member)\n" +
                "\nNo. of Rounds: 3\n" +
                "\n" +
                "INTRODUCTION:\n" +
                "The machine (bot) should navigate the track in minimum possible time by\n" +
                "clearing all obstacles and checkpoints.\n" +
                "\n" +
                "GENERAL RULES:\n" +
                "➢There will be 3 rounds. Two elimination rounds followed  by a final round.\n" +
                "➢The teams are required to complete the track in minimum possible time.\n" +
                "The team will be given two runs in each elimination  round. The best score\n" +
                "of the two runs will be considered.\n" +
                "➢Teams selected from the second elimination  round will qualify for the final round.\n" +
                "➢At the start of the run, the machines will be placed behind the starting\n" +
                "line.\n" +
                "➢The time will start as soon as the front edge of the bot crosses the\n" +
                "line.\n" +
                "➢There will be four checkpoints in the track. The team  has to clear all the\n" +
                "Check points before reaching the finish line.\n" +
                "·➢A total of 3 restarts will be given to the team during the run. If a team\n" +
                "opts for a restart, then the bot will be restarted by placing it at the\n" +
                "previously completed checkpoint.\n" +
                "➢No penalty will be awarded for a restart. During a restart, the team cannot\n" +
                "make any hardware changes or repairs to their bot. Moreover, the time won't be\n" +
                "paused during the restart.\n" +
                "➢In the final round, if all the teams are unable to complete the task in the\n" +
                "stipulated time, then the team  that  reaches the farthest wins.\n" +
                "\n" +
                "MISCELLANEOUS:\n" +
                "➢Any team that is not ready at the time specified will be eliminated from the\n" +
                "Competition  automatically.\n" +
                "➢The bots will be checked for their safety before the run and prohibited from use if found unsafe for other participants and spectators.\n" +
                "➢Organizers' decision shall be treated as final and binding on all.\n" +
                "➢The organizers reserve the right to change any or all of the above rules as\n" +
                "they deem fit.\n" +
                "➢Change in rules, if any, will be highlighted on the website and notified to\n" +
                "the registered participants.\n" +
                "➢In case of ties during elimination round, a re-run will be given to the\n" +
                "teams.\n" +
                "➢The organizing team members will neither be held responsible nor be\n" +
                "liable for any incidents and / or accidents caused by participating\n" +
                "teams and/or their equipment.\n" +
                "\n" +
                "\n" +
                "BOT SPECIFICATIONS:\n" +
                "➢Power supply will be provided to the team at the time of event for its\n" +
                "Machines.\n" +
                "➢The potential difference between any two points of the machines must not\n" +
                "exceed 24 VDC and 6A of current.\n" +
                "➢The machine can be either wired or wireless.\n" +
                "➢The bot dimensions must not exceed 28cm*28cm*28cm.\n" +
                "➢In case the machine is using a non-electric power supply, kindly get it\n" +
                "approved from the organizers beforehand via email. Organizers are not\n" +
                "responsible for inconvenience if approval is not sought.\n" +
                "\n" +
                "Prizes :\n" +
                "\t1st\t:\t12000\n" +
                "\t2st\t:\t8000\n" +
                "\t3st\t:\t5000\n\n"));
        entc_events.add(new Event("CIRCUITRIX", "If you have the potential to make a difference.", "Max. No. of Participants: 1-2 \t\t\t\t\t\t\n" +
                "\nRegistration Fees:\n150/- per team\n" +
                "\nNo. of Rounds: 3\n" +
                "\nDESCRIPTION:\n" +
                "Flaunt your electronic skills by designing and debugging circuits at your disposal.\n" +
                "\nRULES:\n" +
                "➢There would be a qualifying round.\n" +
                "➢In the qualifying round, MCQ test (online) will be taken based on basic electronics\n" +
                "Knowledge at the given  location. Time limit for the qualifying round will be 30 min.\n" +
                "➢Selected groups based on pre-defined cut off score will be promoted  to\n" +
                "next round.\n" +
                "➢In the second round  i.e. ‘Box of Lies’, the contestants would be given a circuit\n" +
                "Along with some specifications.\n" +
                "➢The contestants would have to observe the circuit and have to determine \n" +
                "Whether the given circuit is right or wrong.\n" +
                "➢The groups qualified after the second round would compete in the final round.\n" +
                "➢The final round would be conducted on Multisim software (2012 version).\n" +
                "The participants have to design and  implement the given circuit on the software.\n" +
                "➢The time limit for the final round would be 90 min.\n" +
                "➢Final result will be based on accuracy of the output as well as time taken\n" +
                "by participants.\n" +
                "➢Winners would be declared at the end of the final round. The decision of\n" +
                "the organizers would be final and binding.\n" +
                "\n" +
                "Prizes :\n" +
                "\t1st\t:\t6000\n" +
                "\t2st\t:\t4000\n\n"));

        entc_events.add(new Event("LINE ADEPTO", "Trace your path for the win.", "Max. No. Of participants: 3 \t\t\t\t\t\t\n" +
                "\nRegistration Fee:\n200/-" +
                " (50/- per extra member)\n" +
                "\nNo. of  Rounds: 3\n" +
                "\nIntroduction:\n" +
                "The objective of this contest is for a robot to follow a black line on a white\n" +
                "background, without losing the line. The robot to complete the course in the\n" +
                "shortest period of time while accurately tracking the course line from start to\n" +
                "finish wins.\n" +
                "\nGeneral Rules:\n" +
                "➢Competition will consist of three rounds, two qualifying round and the\n" +
                "final round.\n" +
                "➢Course Time: Time is measured from the time the robot crosses the\n" +
                "starting line until the time it crosses the finish line. A robot is deemed\n" +
                "to have crossed the line when the forward most wheel, track, or leg of\n" +
                "the robot contacts or crosses over the line.\n" +
                "➢Time Limit: A maximum of 5 minutes is allowed for a robot to\n" +
                "complete the course. A robot that cannot complete the course in the\n" +
                "allotted time shall be disqualified.\n" +
                "➢Time Keeping: Time will be measured by a judge with a stopwatch.\n" +
                "The recorded time will be final. Recorded times will not be revealed to their respective teams.\n" +
                "➢Once the participating team begins the round, no alteration of their bot is permitted.\n" +
                "➢Arena Edges: A robot that wanders off of the arena surface will be\n" +
                "disqualified. A robot shall be deemed to have left the arena when any\n" +
                "wheel, leg, or track has moved completely off the arena surface. The\n" +
                "teams are required to complete the track in minimum possible time.\n" +
                "The team will be given two runs in the elimination round. The best\n" +
                "score of the two runs will be considered.\n" +
                "·Preparatory time of 5 minutes would be given to the contestants before \n" +
                "Start of the first 2 rounds.\n" +
                "➢In case of deviation from the track, the team has to continue the race\n" +
                "from previous check point and maximum of 3 attempts are given in the\n" +
                "whole run.\n" +
                "·Track Size: The width of the black line will be 3cm.\n" +
                "\n" +
                "\nMiscellaneous:\n" +
                "➢The participants should ensure that room lighting, photography etc.\n" +
                "does not affect the functioning of sensors.\n" +
                "➢Any team that is not ready at the time specified will be removed from\n" +
                "the competition automatically. Each team has to report at least 15\n" +
                "minutes before the event starts.\n" +
                "➢The teams must not damage the opponent’s bot or track in any way.\n" +
                "Judges reserve the right to disqualify any team indulging in negative\n" +
                "controlling & misbehavior.\n" +
                "➢Maximum voltage batteries allowed is of 15V.Participants should\n" +
                "bring their own power supply/Batteries. \n" +
                "·A maximum of 5 IR pairs are permitted.\n" +
                "➢The bots will be checked for their safety before the run and\n" +
                "prohibited from use if found unsafe for other participants and\n" +
                "spectators.\n" +
                "➢Organizers' decision shall be treated as final and binding on all.\n" +
                "➢Participating teams are responsible for the safety of their robots and\n" +
                "are liable for any accidents caused by their team members or their\n" +
                "robots.\n" +
                "➢The organizing team members will neither be held responsible nor be\n" +
                "liable for any incidents and / or accidents caused by participating\n" +
                "teams and/or their equipment.\n" +
                "➢The organizers reserve the right to change any or all of the above rules\n" +
                "as they deem fit.\n" +
                "➢Change in rules, if any, will be highlighted on the website and notified\n" +
                "to the registered participants.\n" +
                "In case of ties during elimination round, a re-run will be given to the teams.\n" +
                "\n" +
                "Prizes :\n" +
                "\t1st\t:\t6000\n" +
                "\t2st\t:\t4000\n\n"));
        entc_events.add(new Event("BALL WARS", "Aim! Shoot! Defend!", "Max. No. of Participants: 3\t\t\t\t\t\t\n" +
                "\nRegistration Fees: 200/- per team\t\t\t\t\t\t\n" +
                "\nNo. of Rounds: 2\n" +
                "\n" +
                "Texephyr Provided Bots\n" +
                "Max. No. of Participants: 1\nRegistration Fees: 100/- " +
                "(50/- for extra member)\n" +
                "No. of Rounds: 2\n" +
                "\n" +
                "Introduction:\n" +
                "The machine (bot) has to put as many balls as possible from  its area to the opponent’s area. \n" +
                "\n" +
                "Rules:\n" +
                " At the start of the run, the machines will be placed in their respective starting zones. \n" +
                " It will be a one on one match of 5minutes. \n" +
                "If a team opts for a restart, then the machine will be restarted by placing it in its starting zone. \n" +
                " No penalty will be awarded for a restart. \n" +
                "During the match, the teams cannot make any hardware changes or repairs. \n" +
                "At the end, the team with more points wins. \n" +
                "The number of points awarded for different acts and further rules would be notified  by end of February.\n" +
                "\n" +
                "Miscellaneous: \n" +
                "➢Any team that is not ready at the time specified will be removed from the competition automatically. \n" +
                "➢The machines would be checked for their safety before the run and would be discarded if found unsafe for other participants and spectators. \n" +
                "➢Organizers' decision shall be treated as final and binding on all. \n" +
                "➢In any case there should be no damage to the arena. \n" +
                "➢The organizers reserve the right to change any or all of the above rules as they deem fit. \n" +
                "➢Change in rules, if any, will be highlighted on the website and notified to the registered participants. \n" +
                "➢In case of ties during elimination round, a rerun will be given to the teams. \n" +
                "\n" +
                "SPECIFICATIONS: \n" +
                "\n" +
                "1. SUPPLY\n" +
                "\n" +
                "Power supply will be provided to the team at the time of event for its machines. \n" +
                "Onboard power supply is also allowed. \n" +
                "The potential difference between any two points of the machines must not exceed 24V DC and 4A of current. \n" +
                "\n" +
                "2. BOT: \n" +
                "➢The bot dimensions must not exceed 25cm*25cm. \n" +
                "➢The bot can be wired or wireless. In case the machine is using a non-electric power supply, kindly get it approved from the organizers beforehand via email. \n" +
                "➢Organizers are not responsible for inconvenience if approval is not sought. \n" +
                "➢Diameter of ball is 6cm. \n" +
                "➢While travelling, the bot must not carry more than 5 balls.\n" +
                "\n" +
                "Prizes :\n" +
                "\t1st\t:\t6000\n" +
                "\t2st\t:\t4000\n\n" +
                "\n" +
                "Prizes(Our Bot) :\n" +
                "\t1st\t:\t1000\n\n"));


        gaming_events = new ArrayList<>();

        gaming_events.add(new Event("Counter Strike", "This isn't a game. This is real life.", "Max. No. Of participants: 5 per Team\n" +
                "\nPrize : \nWinner: 3,000/-\n" +
                "Runner-Up: 2,000/-\n" +
                "\nRegistration Fees: 300/-\n" +
                 "\nIntroduction:\n" +
                "\n" +
                "Students from all colleges and disciplines are invited to come and display their gaming enthusiasm.\n" +
                "A number of single player games such as NFS and FIFA as well as team games like Counter Strike and DOTA 2 for students to battle each other and claim prizes.\n" +
                "For the first time ever, Texephyr will be offering Wii Sports Tennis as an event for those casual or beginner gamers looking to have a fun time. This event will be in singles and doubles format so find a friend and have some fun!\n" +
                "\nRules:\n" +
                "Major penalties are given for major incidents such as deliberately deceiving admins, failing to show up for matches, repeated rule breaking, and any activities will violate the General Code of Conduct\n" +
                "We will provide the computers, monitors and peripheral devices required by the participants. Participants are free to bring their own peripherals such as a mouse, mousepad, etc. provided they do not provide any unfair advantage.\n" +
                "All matches in the Tournament should start as stated by the event head, no changes to the time can be requested. All Teams and Players in a match should be on the server or in the game lobby and ready to go at the latest 10 minutes before the match is to start\n" +
                "When cheating is uncovered, The Team will be disqualified from the current Tournament. The use of the following programs will result in a cheat ban: Multihacks, Wallhack, Aimbot, Coloured Models, NoRecoil, No-Flash and Sound changes. These are only examples, other programs or methods may be considered cheats as well.\n" +
                "\nIn case of any dispute, Organizers decision will be final and binding for all.\n" +
                "\n" +
                "Prizes :\n" +
                "\t1st\t:\t2000\n" +
                "\t2st\t:\t1000\n\n"));

        gaming_events.add(new Event("NFS", "Fantasy to survive!", "Max. No. Of participants: 1\n" +
                "Winner: 2,000/-\n" +
                "Runner-Up: 1,000/-\n" +
                "\nRegistration Fees: 250/-\n" +
                "\nIntroduction:\n" +
                "\n" +
                "Students from all colleges and disciplines are invited to come and display their gaming enthusiasm.\n" +
                "A number of single player games such as NFS and FIFA as well as team games like Counter Strike and DOTA 2 for students to battle each other and claim prizes.\n" +
                "For the first time ever, Texephyr will be offering Wii Sports Tennis as an event for those casual or beginner gamers looking to have a fun time. This event will be in singles and doubles format so find a friend and have some fun!\n" +
                "\nRules:\n" +
                "Major penalties are given for major incidents such as deliberately deceiving admins, failing to show up for matches, repeated rule breaking, and any activities will violate the General Code of Conduct\n" +
                "We will provide the computers, monitors and peripheral devices required by the participants. Participants are free to bring their own peripherals such as a mouse, mousepad, etc. provided they do not provide any unfair advantage.\n" +
                "All matches in the Tournament should start as stated by the event head, no changes to the time can be requested. All Teams and Players in a match should be on the server or in the game lobby and ready to go at the latest 10 minutes before the match is to start\n" +
                "When cheating is uncovered, The Team will be disqualified from the current Tournament. The use of the following programs will result in a cheat ban: Multihacks, Wallhack, Aimbot, Coloured Models, NoRecoil, No-Flash and Sound changes. These are only examples, other programs or methods may be considered cheats as well.\n" +
                "\nIn case of any dispute, Organizers decision will be final and binding for all.\n" +
                "\n" +
                "Prizes :\n" +
                "\t1st\t:\t2000\n" +
                "\t2st\t:\t1000\n\n"));

        gaming_events.add(new Event("FIFA", "ALL IN ONE RHYTHM™", "Max. No. Of participants: 1\n" +
                "Winner: 2,000/-\n" +
                "Runner-Up: 1,000/-\n" +
                "\nRegistration Fees: 250/-\n" +
                "\nIntroduction:\n" +
                "\n" +
                "Students from all colleges and disciplines are invited to come and display their gaming enthusiasm.\n" +
                "A number of single player games such as NFS and FIFA as well as team games like Counter Strike and DOTA 2 for students to battle each other and claim prizes.\n" +
                "For the first time ever, Texephyr will be offering Wii Sports Tennis as an event for those casual or beginner gamers looking to have a fun time. This event will be in singles and doubles format so find a friend and have some fun!\n" +
                "\nRules:\n" +
                "Major penalties are given for major incidents such as deliberately deceiving admins, failing to show up for matches, repeated rule breaking, and any activities will violate the General Code of Conduct\n" +
                "We will provide the computers, monitors and peripheral devices required by the participants. Participants are free to bring their own peripherals such as a mouse, mousepad, etc. provided they do not provide any unfair advantage.\n" +
                "All matches in the Tournament should start as stated by the event head, no changes to the time can be requested. All Teams and Players in a match should be on the server or in the game lobby and ready to go at the latest 10 minutes before the match is to start\n" +
                "When cheating is uncovered, The Team will be disqualified from the current Tournament. The use of the following programs will result in a cheat ban: Multihacks, Wallhack, Aimbot, Coloured Models, NoRecoil, No-Flash and Sound changes. These are only examples, other programs or methods may be considered cheats as well.\n" +
                "\nIn case of any dispute, Organizers decision will be final and binding for all.\n" +
                "\n" +
                "Prizes :\n" +
                "\t1st\t:\t2000\n" +
                "\t2st\t:\t1000\n\n"));

        gaming_events.add(new Event("DOTA2", "I shall kill!", "Max. No. Of participants: 5\n" +
                "Winner: 3,000/-\n" +
                "Runner-Up: 2,000/-\n" +
                "\nRegistration Fees: 500/-\n" +
                "\nIntroduction:\n" +
                "\n" +
                "Students from all colleges and disciplines are invited to come and display their gaming enthusiasm.\n" +
                "A number of single player games such as NFS and FIFA as well as team games like Counter Strike and DOTA 2 for students to battle each other and claim prizes.\n" +
                "For the first time ever, Texephyr will be offering Wii Sports Tennis as an event for those casual or beginner gamers looking to have a fun time. This event will be in singles and doubles format so find a friend and have some fun!\n" +
                "\nRules:\n" +
                "Major penalties are given for major incidents such as deliberately deceiving admins, failing to show up for matches, repeated rule breaking, and any activities will violate the General Code of Conduct\n" +
                "We will provide the computers, monitors and peripheral devices required by the participants. Participants are free to bring their own peripherals such as a mouse, mousepad, etc. provided they do not provide any unfair advantage.\n" +
                "All matches in the Tournament should start as stated by the event head, no changes to the time can be requested. All Teams and Players in a match should be on the server or in the game lobby and ready to go at the latest 10 minutes before the match is to start\n" +
                "When cheating is uncovered, The Team will be disqualified from the current Tournament. The use of the following programs will result in a cheat ban: Multihacks, Wallhack, Aimbot, Coloured Models, NoRecoil, No-Flash and Sound changes. These are only examples, other programs or methods may be considered cheats as well.\n" +
                "\nIn case of any dispute, Organizers decision will be final and binding for all.\n" +
                "\n" +
                "Prizes :\n" +
                "\t1st\t:\t3000\n" +
                "\t2st\t:\t2000\n\n"));

        gaming_events.add(new Event("Wii Sports Tennis (Singles)", "You got served!", "Max. No. Of participants: 1" +
                "\nWinner: 1,000/-\n" +
                "\nRegistration Fees: 50/-\n" +
                "\nIntroduction:\n" +
                "\n" +
                "Students from all colleges and disciplines are invited to come and display their gaming enthusiasm.\n" +
                "A number of single player games such as NFS and FIFA as well as team games like Counter Strike and DOTA 2 for students to battle each other and claim prizes.\n" +
                "For the first time ever, Texephyr will be offering Wii Sports Tennis as an event for those casual or beginner gamers looking to have a fun time. This event will be in singles and doubles format so find a friend and have some fun!\n" +
                "\nRules:\n" +
                "Major penalties are given for major incidents such as deliberately deceiving admins, failing to show up for matches, repeated rule breaking, and any activities will violate the General Code of Conduct\n" +
                "We will provide the computers, monitors and peripheral devices required by the participants. Participants are free to bring their own peripherals such as a mouse, mousepad, etc. provided they do not provide any unfair advantage.\n" +
                "All matches in the Tournament should start as stated by the event head, no changes to the time can be requested. All Teams and Players in a match should be on the server or in the game lobby and ready to go at the latest 10 minutes before the match is to start\n" +
                "When cheating is uncovered, The Team will be disqualified from the current Tournament. The use of the following programs will result in a cheat ban: Multihacks, Wallhack, Aimbot, Coloured Models, NoRecoil, No-Flash and Sound changes. These are only examples, other programs or methods may be considered cheats as well.\n" +
                "\nIn case of any dispute, Organizers decision will be final and binding for all.\n" +
                "\n" +
                "Prizes : 1000\n\n"));

        gaming_events.add(new Event("Wii Sports Tennis (Doubles)", "You got served!", "Max. No. Of participants: 2" +
                "\nWinner: 2,000/-\n" +
                "\nRegistration Fees: 100/-\n" +
                "\nIntroduction:\n" +
                "\n" +
                "Students from all colleges and disciplines are invited to come and display their gaming enthusiasm.\n" +
                "A number of single player games such as NFS and FIFA as well as team games like Counter Strike and DOTA 2 for students to battle each other and claim prizes.\n" +
                "For the first time ever, Texephyr will be offering Wii Sports Tennis as an event for those casual or beginner gamers looking to have a fun time. This event will be in singles and doubles format so find a friend and have some fun!\n" +
                "\nRules:\n" +
                "Major penalties are given for major incidents such as deliberately deceiving admins, failing to show up for matches, repeated rule breaking, and any activities will violate the General Code of Conduct\n" +
                "We will provide the computers, monitors and peripheral devices required by the participants. Participants are free to bring their own peripherals such as a mouse, mousepad, etc. provided they do not provide any unfair advantage.\n" +
                "All matches in the Tournament should start as stated by the event head, no changes to the time can be requested. All Teams and Players in a match should be on the server or in the game lobby and ready to go at the latest 10 minutes before the match is to start\n" +
                "When cheating is uncovered, The Team will be disqualified from the current Tournament. The use of the following programs will result in a cheat ban: Multihacks, Wallhack, Aimbot, Coloured Models, NoRecoil, No-Flash and Sound changes. These are only examples, other programs or methods may be considered cheats as well.\n" +
                "\nIn case of any dispute, Organizers decision will be final and binding for all.\n" +
                "\n" +
                "Prizes : 2000\n\n"));


        nontech_events = new ArrayList<>();
        nontech_events.add(new Event("PAPARAZZI", "For all the photographers out there!", "\nRegistration Fees: Rs 100/-\n" +
                "\n" +
                "INTRODUCTION:\n" +
                "For all the photographers out there! This is a fun event where you can go around capturing moments and well, a phone camera can do the work too so don’t let it hold you back!! \n" +
                "\nEVENT FORMAT: \n" +
                "➢Participants are allowed to click maximum 25 photographs during the events. n" +
                "➢Participants are requested to submit their photographs in Pen drives.\n" +
                "➢Use of any kind of camera is allowed.\n" +
                "➢Downloaded or copied Photographs will lead to disqualification.\n " +
                "➢Photographs should not be Photoshopped. (Black/sepia is allowed)\n" +
                "➢Submitted Photographs are property of Team TEXEPHYR.\n" +
                "➢Final judging will be done by a Professional Photographer and Judge's Decision will be final.\n " +
                "➢The list of themes will be provided at the start of the event and all the themes on the list should be covered.\n" +
                "➢Photographs should be submitted before 7 pm on 15th March 2018. \n" +
                "➢Photographs should not depict any kind of obscenity or vulgarity. \n" +
                "➢Selected photos will be displayed on the canopy as well as on website.\n" +
                "➢No watermarks are allowed.\n" +
                "\n" +
                "ELIGIBILITY CRITERIA: \n" +
                "Any student with valid ID card of their educational institute can participate.\n" +
                "\n" +
                "Prizes : 2000\n"));
        nontech_events.add(new Event("BOX CRICKET", "Dragons in heart, Dragons on the Field!", "Registration Fees: Rs420/-(5+2)\n" +
                "No. of Rounds: Knock-out\t\t\t\n" +
                "\n" +
                "INTRODUCTION:\n" +
                "A different version of the most loved game in our country. Make a team of 7 (5+2) and off you go!! And of course get a prize on winning!" +
                "\n\nEVENT FORMAT: \n" +
                "➢One tip-one hand out, over-arm bowling; elbow touching the stomach.\n" +
                "➢Elevation of the ropes A, B, C, D, E is 4 ft from ground. Batsman will be declared out if the ball goes directly outside ground over any of the ropes.\n" +
                "➢4 runs will be given if the ball crosses ropes C or D, while 6 runs will be given if the ball crosses C or D without touching the ground. \n" +
                "➢10 bonus runs if the ball touches the board displayed right in front of the batsman.\n" +
                "➢Umpire decision will be the final decision. Arguments with the organizing committee won’t be tolerated, as it has the right to disqualify the team.\n\n" +
                "\nELIGIBILITY CRITERIA: \n" +
                "Any student with valid ID card of their educational institute can participate.\n" +
                "\n" +
                "Prizes :\n" +
                "\t1st\t:\t4000\n" +
                "\t2st\t:\t2000\n"));

        nontech_events.add(new Event("BOX SOCCER", "FDessert warriors in Box!", "Registration Fees: Rs420/- team of 7( 5+2)\n" +
                "No. of Rounds: Knock-out\\n" +
                "\n" +
                "INTRODUCTION:\n" +
                "Here’s a new way to play football! All you need is a team of 5(3+2) so join in and win prizes.\n" +
                "\nEVENT FORMAT:\n" +
                "➢The goals should be hit within 10 feet area.\n" +
                "➢Ball rising above waist will be considered a foul.\n" +
                "➢Three fouls of one team will give one penalty shot to the opposite team.\n" +
                "➢Penalty shot will be from goal to goal. \n" +
                "T➢here’ll be a 15 minutes match.\n" +
                "➢Goal specifications will be given on the spot.\n" +
                "T➢he organizers reserve the right to change any or all of the above rules as they deem fit. Change in rules, if any, will be highlighted on the website and notified to the registered participants. Participants are requested to check website regularly for updates.\n" +
                "\n" +
                "ELIGIBILITY CRITERIA: \n" +
                "Any student with valid ID card of their educational institute can participate.\n" +
                "\n" +
                "Prizes :\n" +
                "\t1st\t:\t4000\n" +
                "\t2st\t:\t2000\n"));

        nontech_events.add(new Event("INQUIZZITIVE", "Things and events happening around!", "Max. No. Of Team Members: 2\t\t\n" +
                "Registration Fees: Rs120/-\n" +
                "No. of Rounds: 2\t\t\t\t\n" +
                "\n" +
                "INTRODUCTION:\n" +
                "If you are well updated with things and events happening around, roll in for this event and test your own reach! \n" +
                "\nEVENT FORMAT: \n" +
                "➢Round 1 (Preliminary Elimination): \n" +
                "➢An elimination round will be conducted at the start.\n" +
                "➢It will be a MCQ quiz covering topics like-\n" +
                "\t\tIndian Politics \n" +
                "\t\tGlobal Sports\n" +
                "\t\tFilms and Television History\n" +
                "➢Top 10 teams will go to the final.\n" +
                "➢Marking scheme for this round will be told to participants before start of round.\n" +
                "➢Round 2 (Finale): \n" +
                "➢Final round will be conducted using following formats -\n" +
                "\t\t\"Infinite Rebound”, \n\t\t\"Rapid Fire\", \n\t\t\"Buzzer Round\".\n" +
                "➢This round will consist of questions on all GK traits. \n" +
                "\nELIGIBILITY CRITERIA: \n" +
                "Any student with valid ID card of their educational institute can participate.\n" +
                "\n" +
                "Prizes :\n" +
                "\t1st\t:\t2000\n" +
                "\t2st\t:\t1000\n\n"));

        nontech_events.add(new Event("Case of Qriosity", "Rack those funny little brainz!", "Max. No. of Participants: 2  \n" +
                "\nRegistration fee:\nRs.100 (For single entry)\n" +
                "Rs.150 (team of two)\n" +
                "\nNo. of Rounds: 2\n" +
                " \nIntroduction:  \n" +
                "Investigate the crime scene and find the criminal. This event is dedicated to all the Sherlock fans who would love to solve mysteries. The only twist here is that the investigations are digital.  \n" +
                " \n" +
                "Round 1- Puzzle questions (60 mins) \n" +
                "A set of puzzles i.e. a problem statements will be given for which the criminals have to be found. Points will be given for solving each puzzle. The more number of puzzles you solve, the more points you earn.  \n" +
                " \n" +
                "Round 2-bid for clues and solve (180 mins)\n" +
                "The teams have to bid for the case they want. They will be shown different set of clues of " +
                "which each set is sufficient to lead to the criminal. If more number of clues are required, the " +
                "participant will buy more clues. Winner will be decided by the time and amount of points left. \n" +
                "\n" +
                "Prizes :\n" +
                "\t1st\t:\t4000\n" +
                "\t2st\t:\t2000\n\n"));

        nontech_events.add(new Event("TREASURE HUNT", "Battle out your clues and the time for your Treasure.", "Max. No. Of participants: 3\n" +
                "\nRegistration Fees: 100/-\n" +
                "\nNo. of Rounds: 4\n" +
                "\nDescription:\n" +
                "\tThe ultimate aim of the game is to find the treasure with the help of maps, compass and someclues. It is a team event which will have 4 rounds and will require teams to find and decrypt clues which are hidden throughout the campus.\n" +
                "\n" +
                "\n" +
                "Rules:\n" +
                "➢Team Event\n" +
                "➢A team must consist of maximum 3 members.\n" +
                "➢Students from any branch  may particiapte.\n" +
                "➢The event will span across both days.\n" +
                "➢Any number of Teams from  same college are allowed.\n" +
                "➢Judges Decisions will be final.\n" +
                "➢The organizers reserve the right to change the rules or nature of rounds at any point of time if the situation demands.\n" +
                "➢Candidates those who do not report at the specific venue on the stipulated time will be disqualified.\n" +
                "➢Each team has to announce a leader at the time of  prelims.\n" +
                "➢The means used  by the teams should be fair, in case of any violation of the rules or any use of unfair means, teams will be disqualified from the contest.\n" +
                "➢Wallets, mobile phones and all the other device of communication or IT devices may be taken away from the participants during the rounds." +
                "\n\n" +
                "Prizes :\n" +
                "\t1st\t:\t2000\n" +
                "\t2st\t:\t1000\n\n"));

        project_events = new ArrayList<>();
        project_events.add(new Event("BE PROJECT", "Innovation gets amplified!", "Max. No. of participants: 3 \t\t\t\t\t\n" +
                "Registration fee:  300/-\n" +
                "(50/- for extra member)\n" +
                "No. of rounds: 2\n" +
                "\n" +
                "Introduction:\n" +
                "For all final year students, Texephyr’18 provides you a platform to " +
                "demonstrate your talent. The event has received an overwhelming " +
                "response in the past few years with students from different colleges " +
                "enthusiastically being a part of it. The contest, being judged by highly " +
                "qualified faculty members and industrial experts, provides hands-on " +
                "experience for industrial projects and gives students a rare chance for " +
                "open interaction with industrial expertise.\n" +
                "\nRules:\n" +
                "➢This event is for students from E &TC, ETX, Computer, IT and  Mechanical branches\n" +
                "only.\n" +
                "➢Computers and Power Supply would be provided by us.\n" +
                "➢Any other equipment/prerequisite must be borne by  the participants.\n" +
                "➢The decision of the judges would be final and binding.\n" +
                "➢Participants should only be from recognized educational\n" +
                "institutes/universities.\n" +
                "➢Participants have to bring their College ID cards and the receipt of\n" +
                "registration during reporting.\n" +
                "➢Time slots will be given and participants are expected to follow it strictly.\n" +
                "➢Participants are expected to give their correct contact details, so as to\n" +
                "inform them about the results.\n" +
                "➢Details of the round will be disclosed at the time of event.\n" +
                "➢Rules may be changed without prior intimation. Participants are requested\n" +
                "to check the TEXEPHYR website regularly for updates.\n" +
                "\n" +
                "Prizes : 5000 (per node)\n\n"));

        project_events.add(new Event("TE PROJECT", "In this reign of innovators, let your idea shout.", "Max. No. Of participants: 3 \n" +
                "\nRegistration Fees:\n200/-" +
                "(50/- for extra member)\n" +
                "\nNo. of Rounds: 2\n" +
                "\nDescription:\n" +
                "For all third year students, Texephyr’18 provides you  a platform to " +
                "Demonstrate your talent. The competition aims at bringing out the ‘techie’ " +
                "in you. The judges would be eminent faculty members and industry " +
                "experts from various reputed institutions, providing a rare chance for " +
                "students to interact with industry experts from their fields. So grab this " +
                "excellent opportunity to nurture and enhance your talent!\n" +
                "\n" +
                "Rules:\n" +
                "➢This event is for students from E &TC, ETX, Computer and  IT branches\n" +
                "only.\n" +
                "➢Computers and Power Supply will be provided by us.\n" +
                "➢Any other equipment/prerequisite must be borne by the participants.\n" +
                "➢The decision of the judges would be final and binding.\n" +
                "\n" +
                "Prizes :\n" +
                "\t1st\t:\t5000\n" +
                "\t2st\t:\t3000\n\n"));
        //project_events.add(new Event("", "", ""));


        events.put("1. Computer Department", comp_events);
        events.put("2. Mechanical Department", mech_events);
        events.put("3. ENTC Department", entc_events);
        events.put("6. Gaming Events", gaming_events);
        events.put("5. Non Technical Events", nontech_events);
        events.put("4. Project Events", project_events);
        return events;
    }

    public String title;
    public String shortText;
    public String text;

    public Event(String title, String shortText, String text) {
        this.title = title;
        this.shortText = shortText;
        this.text = text;
    }

}
