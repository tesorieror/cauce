package rsmm.diagram.expressions;

import java.util.Collections;
import java.util.Map;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.ocl.Environment;
import org.eclipse.ocl.EvaluationEnvironment;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.EcoreFactory;
import org.eclipse.ocl.ecore.OCLExpression;
import org.eclipse.ocl.ecore.Variable;
import org.eclipse.ocl.ecore.OCL.Helper;
import org.eclipse.ocl.options.ParsingOptions;

import rsmm.diagram.part.SpaceReferenceDiagramEditorPlugin;

/**
 * @generated
 */
public class SpaceReferenceOCLFactory {

	/**
	 * @generated
	 */
	private final SpaceReferenceAbstractExpression[] expressions;

	/**
	 * @generated
	 */
	private final String[] expressionBodies;

	/**
	 * @generated
	 */
	protected SpaceReferenceOCLFactory() {
		this.expressions = new SpaceReferenceAbstractExpression[30];
		this.expressionBodies = new String[] {
				"system.entityReferences->collect(id)\r\n->union(system.referentialSpaces->collect(id))\r\n->union(system.spaceToSpaceReferenceDependencies->collect(id))\r\n->union(system.spaceToEntityReferenceDependencies->collect(id))\r\n->iterate(id; m:Integer=0 |  m.max(id)) + 1", //$NON-NLS-1$
				"\'EntityReference\'.concat(\r\nlet number: Integer = id \r\nin OrderedSet{1000000, 10000, 1000, 100, 10, 1}\r\n->iterate(denominator : Integer; s : String = \'\' | let numberAsString : String= OrderedSet{\'0\',\'1\',\'2\',\'3\',\'4\',\'5\',\'6\',\'7\',\'8\',\'9\'}->at(number.div(denominator).mod(10) + 1)\r\nin if s=\'\' and numberAsString = \'0\' then s else s.concat(numberAsString) endif\r\n))", //$NON-NLS-1$
				"self.name", //$NON-NLS-1$
				"system.entityReferences->collect(id)\r\n->union(system.referentialSpaces->collect(id))\r\n->union(system.spaceToSpaceReferenceDependencies->collect(id))\r\n->union(system.spaceToEntityReferenceDependencies->collect(id))\r\n->iterate(id; m:Integer=0 |  m.max(id)) + 1", //$NON-NLS-1$
				"\'SpaceReference\'.concat(\r\nlet number: Integer = id \r\nin OrderedSet{1000000, 10000, 1000, 100, 10, 1}\r\n->iterate(denominator : Integer; s : String = \'\' | let numberAsString : String= OrderedSet{\'0\',\'1\',\'2\',\'3\',\'4\',\'5\',\'6\',\'7\',\'8\',\'9\'}->at(number.div(denominator).mod(10) + 1)\r\nin if s=\'\' and numberAsString = \'0\' then s else s.concat(numberAsString) endif\r\n))", //$NON-NLS-1$
				"1", //$NON-NLS-1$
				"system.entityReferences->collect(id)\r\n->union(system.referentialSpaces->collect(id))\r\n->union(system.spaceToSpaceReferenceDependencies->collect(id))\r\n->union(system.spaceToEntityReferenceDependencies->collect(id))\r\n->iterate(id; m:Integer=0 |  m.max(id)) + 1", //$NON-NLS-1$
				"incomingReferenceDependency.oclIsUndefined()", //$NON-NLS-1$
				"system.entityReferences->collect(id)\r\n->union(system.referentialSpaces->collect(id))\r\n->union(system.spaceToSpaceReferenceDependencies->collect(id))\r\n->union(system.spaceToEntityReferenceDependencies->collect(id))\r\n->iterate(id; m:Integer=0 |  m.max(id)) + 1", //$NON-NLS-1$
				"1", //$NON-NLS-1$
				"incomingReferenceDependency.oclIsUndefined()", //$NON-NLS-1$
				"self.size()>0", //$NON-NLS-1$
				"referentialSpaces->forAll(rs | rs.name<>self.name) and\r\nentityReferences->forAll(e | e.name <> self.name)", //$NON-NLS-1$
				"self>=0", //$NON-NLS-1$
				"referentialSpaces->forAll(rs | rs.id<>self.id) and\r\nspaceToSpaceReferenceDependencies->forAll(rd | rd.id<> self.id) and\r\nspaceToEntityReferenceDependencies->forAll(rd | rd.id<> self.id) and\r\nentityReferences->forAll(e | e.id <> self.id)", //$NON-NLS-1$
				"self.size()>0", //$NON-NLS-1$
				"system.referentialSpaces->forAll(rs | (rs<>self) implies (rs.name<>self.name)) and\r\nsystem.entityReferences->forAll(e | e.name <> self.name) and\r\n(system.name<>self.name) ", //$NON-NLS-1$
				"self>0", //$NON-NLS-1$
				"system.referentialSpaces->forAll(rs | (rs<>self) implies (rs.id<>self.id)) and\r\nsystem.spaceToSpaceReferenceDependencies->forAll(rd | rd.id<> self.id) and\r\nsystem.spaceToEntityReferenceDependencies->forAll(rd | rd.id<> self.id) and\r\nsystem.entityReferences->forAll(e | e.id <> self.id)", //$NON-NLS-1$
				"self.size()>0", //$NON-NLS-1$
				"system.referentialSpaces->forAll(rs | (rs.name<>self.name)) and\r\nsystem.entityReferences->forAll(e | (e<>self) implies (e.name <> self.name)) and\r\n(system.name<>self.name) ", //$NON-NLS-1$
				"self>0", //$NON-NLS-1$
				"system.referentialSpaces->forAll(rs | (rs.id<>self.id)) and\r\nsystem.spaceToSpaceReferenceDependencies->forAll(rd | rd.id<> self.id) and\r\nsystem.spaceToEntityReferenceDependencies->forAll(rd | rd.id<> self.id) and\r\nsystem.entityReferences->forAll(e |  (e<>self) implies (e.id <> self.id))", //$NON-NLS-1$
				"self.size()>0", //$NON-NLS-1$
				"incomingReferenceDependency->size()>0", //$NON-NLS-1$
				"self>0", //$NON-NLS-1$
				"system.referentialSpaces->forAll(rs | (rs.id<>self.id)) and\r\nsystem.spaceToSpaceReferenceDependencies->forAll(rd | (rd<>self) implies (rd.id<> self.id)) and\r\nsystem.spaceToEntityReferenceDependencies->forAll(rd | (rd<>self) implies (rd.id<> self.id)) and\r\nsystem.entityReferences->forAll(e |  (e.id <> self.id))", //$NON-NLS-1$
				"self>0", //$NON-NLS-1$
				"child <> parent", //$NON-NLS-1$
				"system.referentialSpaces->forAll(rs | (rs.id<>self.id)) and\r\nsystem.spaceToSpaceReferenceDependencies->forAll(rd | (rd<>self) implies (rd.id<> self.id)) and\r\nsystem.spaceToEntityReferenceDependencies->forAll(rd | (rd<>self) implies (rd.id<> self.id)) and\r\nsystem.entityReferences->forAll(e |  (e.id <> self.id))", //$NON-NLS-1$
		};
	}

	/**
	 * @generated
	 */
	private static SpaceReferenceOCLFactory getInstance() {
		SpaceReferenceOCLFactory instance = SpaceReferenceDiagramEditorPlugin
				.getInstance().getSpaceReferenceOCLFactory();
		if (instance == null) {
			SpaceReferenceDiagramEditorPlugin.getInstance()
					.setSpaceReferenceOCLFactory(
							instance = new SpaceReferenceOCLFactory());
		}
		return instance;
	}

	/**
	 * @generated
	 */
	public static String getExpressionBody(int index) {
		return getInstance().expressionBodies[index];
	}

	/**
	 * @generated
	 */
	public static SpaceReferenceAbstractExpression getExpression(int index,
			EClassifier context, Map<String, EClassifier> environment) {
		SpaceReferenceOCLFactory cached = getInstance();
		if (index < 0 || index >= cached.expressions.length) {
			throw new IllegalArgumentException();
		}
		if (cached.expressions[index] == null) {
			cached.expressions[index] = getExpression(
					cached.expressionBodies[index],
					context,
					environment == null ? Collections
							.<String, EClassifier> emptyMap() : environment);
		}
		return cached.expressions[index];
	}

	/**
	 * This is factory method, callers are responsible to keep reference to the return value if they want to reuse parsed expression
	 * @generated
	 */
	public static SpaceReferenceAbstractExpression getExpression(String body,
			EClassifier context, Map<String, EClassifier> environment) {
		return new Expression(body, context, environment);
	}

	/**
	 * This method will become private in the next release
	 * @generated
	 */
	public static SpaceReferenceAbstractExpression getExpression(String body,
			EClassifier context) {
		return getExpression(body, context,
				Collections.<String, EClassifier> emptyMap());
	}

	/**
	 * @generated
	 */
	private static class Expression extends SpaceReferenceAbstractExpression {

		/**
		 * @generated
		 */
		private final org.eclipse.ocl.ecore.OCL oclInstance;

		/**
		 * @generated
		 */
		private OCLExpression oclExpression;

		/**
		 * @generated
		 */
		public Expression(String body, EClassifier context,
				Map<String, EClassifier> environment) {
			super(body, context);
			oclInstance = org.eclipse.ocl.ecore.OCL.newInstance();
			initCustomEnv(oclInstance.getEnvironment(), environment);
			Helper oclHelper = oclInstance.createOCLHelper();
			oclHelper.setContext(context());
			try {
				oclExpression = oclHelper.createQuery(body());
				setStatus(IStatus.OK, null, null);
			} catch (ParserException e) {
				setStatus(IStatus.ERROR, e.getMessage(), e);
			}
		}

		/**
		 * @generated
		 */
		@SuppressWarnings("rawtypes")
		protected Object doEvaluate(Object context, Map env) {
			if (oclExpression == null) {
				return null;
			}
			// on the first call, both evalEnvironment and extentMap are clear, for later we have finally, below.
			EvaluationEnvironment<?, ?, ?, ?, ?> evalEnv = oclInstance
					.getEvaluationEnvironment();
			// initialize environment
			for (Object nextKey : env.keySet()) {
				evalEnv.replace((String) nextKey, env.get(nextKey));
			}
			try {
				Object result = oclInstance.evaluate(context, oclExpression);
				return oclInstance.isInvalid(result) ? null : result;
			} finally {
				evalEnv.clear();
				oclInstance.setExtentMap(null); // clear allInstances cache, and get the oclInstance ready for the next call
			}
		}

		/**
		 * @generated
		 */
		private static void initCustomEnv(
				Environment<?, EClassifier, ?, ?, ?, EParameter, ?, ?, ?, ?, ?, ?> ecoreEnv,
				Map<String, EClassifier> environment) {
			// Use EObject as implicit root class for any object, to allow eContainer() and other EObject operations from OCL expressions
			ParsingOptions.setOption(ecoreEnv,
					ParsingOptions.implicitRootClass(ecoreEnv),
					EcorePackage.eINSTANCE.getEObject());
			for (String varName : environment.keySet()) {
				EClassifier varType = environment.get(varName);
				ecoreEnv.addElement(varName,
						createVar(ecoreEnv, varName, varType), false);
			}
		}

		/**
		 * @generated
		 */
		private static Variable createVar(
				Environment<?, EClassifier, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> ecoreEnv,
				String name, EClassifier type) {
			Variable var = EcoreFactory.eINSTANCE.createVariable();
			var.setName(name);
			var.setType(ecoreEnv.getUMLReflection().getOCLType(type));
			return var;
		}
	}
}
