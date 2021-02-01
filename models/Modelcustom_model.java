// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class Modelcustom_model extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer legsandfeet;
	private final ModelRenderer bodyandarms;
	private final ModelRenderer bb_main;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;

	public Modelcustom_model() {
		textureWidth = 64;
		textureHeight = 64;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 24.0F, 0.0F);
		head.setTextureOffset(30, 8).addBox(-3.0F, -20.0F, 0.0F, 5.0F, 4.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(18, 28).addBox(2.0F, -22.0F, 0.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(19, 3).addBox(-4.0F, -23.0F, 2.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(19, 3).addBox(2.0F, -23.0F, 2.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(25, 0).addBox(-4.0F, -22.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(20, 24).addBox(-4.0F, -22.0F, 2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(-4.0F, -22.0F, 0.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(2.0F, -24.0F, 3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(-4.0F, -24.0F, 3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(24, 3).addBox(2.0F, -22.0F, 1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(-3.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		legsandfeet = new ModelRenderer(this);
		legsandfeet.setRotationPoint(3.0F, -21.0F, 1.0F);
		head.addChild(legsandfeet);
		legsandfeet.setTextureOffset(0, 35).addBox(-7.0F, 15.0F, 0.0F, 2.0F, 6.0F, 1.0F, 0.0F, false);
		legsandfeet.setTextureOffset(0, 27).addBox(-2.0F, 15.0F, 0.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
		legsandfeet.setTextureOffset(19, 0).addBox(-2.0F, 20.0F, -2.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		legsandfeet.setTextureOffset(0, 0).addBox(-2.0F, 19.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F, false);
		legsandfeet.setTextureOffset(20, 20).addBox(-2.0F, 18.0F, 0.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
		legsandfeet.setTextureOffset(10, 27).addBox(-7.0F, 20.0F, -2.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);

		bodyandarms = new ModelRenderer(this);
		bodyandarms.setRotationPoint(0.0F, 21.0F, -2.0F);

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.setTextureOffset(0, 0).addBox(-4.0F, -16.0F, -1.0F, 7.0F, 10.0F, 5.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 15).addBox(-5.0F, -17.0F, 4.0F, 9.0F, 11.0F, 1.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(2.0F, -9.0F, 5.0F);
		bb_main.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.3054F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(20, 20).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 6.0F, 0.0F, false);
		cube_r1.setTextureOffset(24, 0).addBox(-6.0F, -1.0F, 0.0F, 2.0F, 2.0F, 6.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-3.0F, -13.0F, 5.0F);
		bb_main.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.2182F, 0.0F, 0.0F);
		cube_r2.setTextureOffset(20, 9).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 6.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(2.0F, -13.0F, 5.0F);
		bb_main.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.3054F, 0.0F, 0.0F);
		cube_r3.setTextureOffset(0, 27).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 6.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-7.5F, -9.5F, 1.0F);
		bb_main.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.1745F, 0.3927F, -0.9163F);
		cube_r4.setTextureOffset(16, 28).addBox(-1.0F, -2.0F, -5.0F, 2.0F, 2.0F, 6.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-8.0F, -9.0F, 1.0F);
		bb_main.addChild(cube_r5);
		setRotationAngle(cube_r5, -0.2182F, 0.0F, -0.3491F);
		cube_r5.setTextureOffset(20, 17).addBox(-1.0F, -2.0F, 0.0F, 7.0F, 2.0F, 1.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(9.0F, -12.75F, -11.0F);
		bb_main.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.1745F, 0.3927F, -0.9163F);
		cube_r6.setTextureOffset(26, 30).addBox(-5.5922F, -0.0748F, 5.9181F, 2.0F, 2.0F, 6.0F, 0.0F, false);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(4.0F, -11.0F, 1.0F);
		bb_main.addChild(cube_r7);
		setRotationAngle(cube_r7, -0.2182F, 0.0F, -0.3491F);
		cube_r7.setTextureOffset(30, 20).addBox(-1.0F, -2.0F, 0.0F, 7.0F, 2.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks,
			float netHeadYaw, float headPitch) {
		// previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		bodyandarms.render(matrixStack, buffer, packedLight, packedOverlay);
		bb_main.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}