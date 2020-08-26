import { SkillEffect } from './skill-effect';

export class Skill {
	id: number;
	iconUrl: string;
	name: string;
	unlockCondition: string;
	cdLvl1: number;
	cdLvl6: number;
	cdLvl10: number;
	unlockOrder: number;

	skillEffects: SkillEffect[];
}
