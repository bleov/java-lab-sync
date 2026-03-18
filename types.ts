export interface File {
	isVisible: boolean;
	tabOrder: number;
	text: string;
}

export interface Level {
	bubbleChoiceDescription: string;
	csaViewMode: "neighborhood" | "theatre" | string;
	displayName: string;
	encrypted: boolean;
	encryptedExemplarSources: string;
	encryptedValidation: string;
	hideShareAndRemix: boolean;
	id: string;
	inRestrictedShareMode: boolean;
	isNavigator: boolean;
	isPassing: boolean;
	isStarted: boolean;
	lastAttempt: Record<string, File>;
	lesson_total: number;
	levelId: string;
	levelVideos: any[];
	longInstructions: string;
	mapReference: any;
	miniRubric: boolean;
	name: string;
	nameSuffix: string;
	programmingEnvironment: string;
	puzzle_number: number;
	recaptchaSiteKey: string;
	referenceLinks: string[];
	serializedMaze: any[];
	startSources: Record<string, File>;
	submittable: boolean;
	teacherHasConfirmedUploadWarning: boolean;
	thumbnailUrl: string;
	ttsLongInstructionsUrl: string;
	ttsShortInstructionsUrl: string;
	validation: Record<string, string>[];
	videoKey: string;
}