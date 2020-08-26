import { SkillEffect } from './skill-effect';

export class NoblePhantasm {
	id: number;
	name: string;
	cardType: string;
	npType: string;
	rank: string;
	hits: number;
	perHitPercentage: number;
	unlockOrder: number;

	effects: SkillEffect[];
	overchargeEffects: SkillEffect[];
}
